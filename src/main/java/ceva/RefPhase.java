package ceva;


import cool.parser.CoolParser;
import cool.parser.CoolParserBaseListener;
import cool.structures.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;
import java.util.stream.Collectors;

public class RefPhase extends CoolParserBaseListener {
    List<String> varerr = new ArrayList<>();
    String letReturnType = null;
    String functieReturnType = null;
    String curentLetVar = null;
    String returnTypeExpresie = null;
    boolean block = false;
    String blockReturnType = null;
    boolean atribuire = false;
    String caseReturnType = null;
    String thenType = null;
    String elseType = null;
    Stack<String> varAtrib = new Stack<>();
    List<String> caseVars = new ArrayList<>();
    boolean letbody = false;
    boolean casee = false;
    boolean ifcond = false;
    boolean errorlet = false;
    boolean unar = false;
    boolean whileLoop = false;
    String unarsemn = "";
    boolean aritm = false;
    boolean ifel = false;
    boolean ineg = false;
    boolean egal = false;
    String inegOp = "";
    String semn = "";
    int indexParamFormal = 0;
    ScopVariabila varInEgal = null;
    public Map<String, ScopClass> global;
    Map<String,String> letVars = new HashMap<>();
    public Map<String,String> mostenire;
    Map<String, Token> salvari;
    Map<String, ParserRuleContext> salvari2;
    ScopClass parent;
    ScopClass curentClass;
    ScopFunctie curentFunction;
    ScopVariabila currentVariable;
    boolean whilehead = false;
    boolean functie = false;
    boolean ifbody = false;
    boolean ifthen = false;
    boolean ifelse = false;
    boolean casebody  = false;
    ScopLet curentLet;
    boolean letcorp = false;

    private String getRealParent(String clazz) {
        int times = 0;
        while(mostenire.get(clazz)!= null) {
            times++;
            clazz = mostenire.get(clazz);
            if(times > 1000) {
                SymbolTable.error(salvari2.get(clazz), ((CoolParser.ClassxxContext)salvari2.get(clazz)).TYPE(0).getSymbol() ,
                        "Inheritance cycle for class "+  ((CoolParser.ClassxxContext)salvari2.get(clazz)).TYPE(0).getText());
                break;

            }
        }
        return clazz;
    }

    //    List<String> tipuri;
//    ParseTreeProperty<Scope> scopes;
//    GlobalScope globals;
//    Scope currentScope;
    public RefPhase(Map<String, ScopClass> global, Map<String, String> mostenire, Map<String, Token> salvari,Map<String, ParserRuleContext> salvari2) {
        this.global = global;
        this.mostenire = mostenire;
        this.salvari = salvari;
        this.salvari2 = salvari2;
    }
    @Override public void enterProgram(CoolParser.ProgramContext ctx) {
         Set<String> set1 = new HashSet<>(mostenire.keySet());
        set1.retainAll(mostenire.values());
        if(set1.size() == 1) return;
       // set1.stream().forEach(x ->  SymbolTable.error(salvari2.get(x), ((CoolParser.ClassxxContext)salvari2.get(x)).TYPE(0).getSymbol() ,"Inheritance cycle for class "+  ((CoolParser.ClassxxContext)salvari2.get(x)).TYPE(0).getText() ));
        set1.forEach(this::getRealParent);

    }
    /**
     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitProgram(CoolParser.ProgramContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
    @Override public void enterBody(CoolParser.BodyContext ctx) {
       block = true;
    salvari.put("block",ctx.AS().getSymbol());}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBody(CoolParser.BodyContext ctx) { block = false; }

    @Override public void enterClassxx(CoolParser.ClassxxContext ctx) {
        String name = ctx.TYPE(0).getText();
        curentClass = global.get(name);
         if(ctx.TYPE().size() > 1) {
           String nameInh = ctx.TYPE(1).getText();
           if(!global.containsKey(nameInh) && !SymbolTable.isBuiltIn(nameInh) && !nameInh.equals("SELF_TYPE")) {
            SymbolTable.error(ctx,ctx.TYPE(1).getSymbol()  ,"Class "+  ctx.TYPE(0).getText() + " has undefined parent " + ctx.TYPE(1).getText());
            return;
           }
            parent = global.get(nameInh);

         }

    }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitClassxx(CoolParser.ClassxxContext ctx) {
//        currentScope = currentScope.getEnclosingScope();}
    /**
     //     * {@inheritDoc}
     //     *
     //     * <p>The default implementation does nothing.</p>
     //     */
    @Override public void enterFunctie(CoolParser.FunctieContext ctx) { functie = true;
        indexParamFormal = 0;
        String name = ctx.ID().getText();
        String returnType = ctx.TYPE().getText();
        if(Objects.nonNull(parent)) {
            if(parent.functieReturnType.containsKey(name)) {
                String returnTypeFromParent = parent.functieReturnType.get(name);
                if(!returnType.equals(returnTypeFromParent)) {
                    SymbolTable.error(ctx,ctx.TYPE().getSymbol()  ,"Class "+  curentClass.getName() + " overrides method " + ctx.ID().getText() + " but changes return type from " + returnTypeFromParent
                    + " to " + returnType);
                    //return;

                }
            }
            if(parent.functii.containsKey(name)) {
                if(parent.functii.get(name).variabileFormale.values().size() != curentClass.functii.get(name).variabileFormale.values().size()) {
                    SymbolTable.error(ctx,ctx.ID().getSymbol()  ,"Class "+  curentClass.getName() + " overrides method " + ctx.ID().getText() + " with different number of formal parameters");
                }
            }
        }
        curentFunction = curentClass.functii.get(name);

    }
    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
  @Override public void exitFunctie(CoolParser.FunctieContext ctx) {functie = false;
//        if(functieReturnType != null) {
//            if(!functieReturnType.equals(curentFunction.returnType)) {
//                SymbolTable.error(ctx,ctx.TYPE().getSymbol()  ,"Type "+  functieReturnType + " of the body of method " + curentFunction.getName() + " is incompatible with declared return type "
//                        + curentFunction.returnType );
//            }
//        }
  }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
    @Override public void enterAtribut(CoolParser.AtributContext ctx) {
         String id = ctx.ID().getText();
         varAtrib.push(id);
        String type = ctx.TYPE().getText();

        if(varerr.contains(id)) {
            return;
        }

        if(!global.containsKey(type)
         && !SymbolTable.isBuiltIn(type)) {

            SymbolTable.error(ctx,ctx.TYPE().getSymbol()  ,"Class "+  curentClass.getName() + " has attribute " + ctx.ID().getText() + " with undefined type " + type );
            return;
        }
        if(parent!=null) {

            if(parent.atribute.containsKey(id)) {

                SymbolTable.error(ctx,ctx.ID().getSymbol()  ,"Class "+  curentClass.getName() + " redefines inherited attribute " + ctx.ID().getText() );
                varerr.add(id);
                return;
            }
        }
        if(ctx.ATRIBUIRE() != null) {
            currentVariable = curentClass.atribute.get(id);
        }



    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitAtribut(CoolParser.AtributContext ctx) {
        currentVariable = null;


        if(varerr.contains(ctx.ID().getText())) {
            varAtrib.pop();
            returnTypeExpresie = null;
            return;
        }
        if(returnTypeExpresie != null) {
            if (!ctx.TYPE().getText().equals(returnTypeExpresie)) {
                if(ctx.TYPE().getText().equals(mostenire.get(returnTypeExpresie)) /*|| returnTypeExpresie.equals(mostenire.get(ctx.TYPE().getText()))*/) {
                    return;
                }
                SymbolTable.error(ctx, ctx.expresiexx().start, "Type " + returnTypeExpresie + " of initialization expression of attribute " + ctx.ID().getText() + " is incompatible with declared type " + ctx.TYPE().getText());
                returnTypeExpresie = null;
            }
        }
        varAtrib.pop();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFormalxx(CoolParser.FormalxxContext ctx) {
        String name = ctx.ID().getText();
        String type = ctx.TYPE().getText();

        if(!global.containsKey(type)
                && !SymbolTable.isBuiltIn(type) && !type.equals("SELF_TYPE")) {

            SymbolTable.error(ctx,ctx.TYPE().getSymbol()  ,"Method "+ curentFunction.getName() + " of class "  + curentClass.getName() + " has formal parameter " +
                    name  + " with undefined type " + type );
          //  return;
        }

        if(Objects.nonNull(parent)) {
            if(parent.functii.containsKey(curentFunction.getName())) {
                String typeFormalParent = (String) Arrays.asList(parent.functii.get(curentFunction.getName()).variabileFormale.values().toArray()).get(indexParamFormal);
                if(!type.equals(typeFormalParent)) {
                    SymbolTable.error(ctx,ctx.TYPE().getSymbol()  ,"Class "+ curentClass.getName() + " overrides method "  + curentFunction.getName() + " but changes type of formal parameter " +
                            name  + " from " + typeFormalParent + " to " + type );
                 //   return;
                }
            }
        }
        indexParamFormal++;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitFormalxx(CoolParser.FormalxxContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterNew(CoolParser.NewContext ctx) {
        if(global.get(ctx.TYPE().getText()) == null) {
            SymbolTable.error(ctx,ctx.TYPE().getSymbol()  ,"new is used with undefined type "+  ctx.TYPE() );
            return;
        }
        returnTypeExpresie = ctx.TYPE().getText();
        if(atribuire) {
            String typePrimul = curentFunction.variabileFormale.get(varAtrib.peek());
            if(typePrimul == null && letbody) {
                typePrimul = curentLet.letVars.get(varAtrib.peek());
            }
            if(!ctx.TYPE().getText().equals(typePrimul)) {
                if(mostenire.get(ctx.TYPE().getText())!= null) {
                    if(typePrimul.equals(mostenire.get(ctx.TYPE().getText()))) {
                        return;
                    }
                }
                if(letbody) {
                    SymbolTable.error(ctx,ctx.NEW().getSymbol()  ,"Type " + ctx.TYPE().getText() + " of initialization expression of identifier "+ varAtrib.peek() +
                            " is incompatible with declared type " + typePrimul );
                    return;
                }
                SymbolTable.error(ctx,ctx.NEW().getSymbol()  ,"Type " + ctx.TYPE().getText() + " of assigned expression is incompatible with declared type "+ typePrimul + " of identifier " + varAtrib.peek() );
            }
        }

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitNew(CoolParser.NewContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterMinus(CoolParser.MinusContext ctx) {
        aritm=true;
        semn = "-";
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitMinus(CoolParser.MinusContext ctx) {aritm = false;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterString(CoolParser.StringContext ctx) {
        if(block) {
            blockReturnType = "String";
        }

        if(casebody) {
            caseVars.add("String");
        }
        if(unar) {
            SymbolTable.error(ctx,ctx.STRING().getSymbol()  ,"Operand of " + unarsemn + " has type String" +  " instead of Int"  );
            varerr.add(currentVariable.name);
        }

        if(egal) {
            if(varInEgal != null) {
                if(!"String".equals(varInEgal.type)) {
                    SymbolTable.error(ctx,salvari.get("=")  ,"Cannot compare " + varInEgal.type + " with String"  );

                }
            }
            if(varInEgal == null) {
                varInEgal = new ScopVariabila(ctx.STRING().getText(),"String");
            }
        }

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitString(CoolParser.StringContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterBool(CoolParser.BoolContext ctx) {
        returnTypeExpresie = "Bool";
        functieReturnType = "Bool";
        if(casebody) {
            caseVars.add("Bool");
        }
        if(ifelse) {
            elseType = "Bool";
        }
        if(aritm) {
            SymbolTable.error(ctx,ctx.BOOL().getSymbol()  ,"Operand of " + semn + " has type Bool"  + " instead of Int"  );

        }

        if(letbody) {
            if(!curentLet.letVars.get(curentLetVar).equals("Bool")) {
                SymbolTable.error(ctx,ctx.BOOL().getSymbol()  ,"Type Bool of initialization expression of identifier " + curentLetVar + " is incompatible with declared type " + curentLet.letVars.get(curentLetVar)  );
            }
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitBool(CoolParser.BoolContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterFunccall(CoolParser.FunccallContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitFunccall(CoolParser.FunccallContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterIsvoid(CoolParser.IsvoidContext ctx) {
        returnTypeExpresie = "Bool";
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitIsvoid(CoolParser.IsvoidContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterInm(CoolParser.InmContext ctx) {
        returnTypeExpresie = "Int";
        aritm = true;
        semn = "*";

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitInm(CoolParser.InmContext ctx) {
        aritm = false;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterImp(CoolParser.ImpContext ctx) {
        returnTypeExpresie = "Int";

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitImp(CoolParser.ImpContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterPlus(CoolParser.PlusContext ctx) {
        returnTypeExpresie = "Int";
        if(letcorp) {
            letReturnType = "Int";
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitPlus(CoolParser.PlusContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterWhilehead(CoolParser.WhileheadContext ctx) {
        whilehead = true;
        if(atribuire) {
            SymbolTable.error(ctx,ctx.WHILE().getSymbol()  ,"Type Object of assigned expression is incompatible with declared type " + curentClass.atribute.get(varAtrib.peek()).type + " of identifier " +
                    varAtrib.peek());

        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitWhilehead(CoolParser.WhileheadContext ctx) { whilehead = false; }
    @Override
    public void enterWhileloop(CoolParser.WhileloopContext ctx) {
        whileLoop = true;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitWhileloop(CoolParser.WhileloopContext ctx) { whileLoop = false;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterNot(CoolParser.NotContext ctx) {
        unar = true;
        unarsemn = "not";
        //returnTypeExpresie = "Bool";

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitNot(CoolParser.NotContext ctx) {
        unar = false;
        returnTypeExpresie = "Bool";

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterIntt(CoolParser.InttContext ctx) {

        if(casebody) {
            caseVars.add("Int");
        }

        if(egal) {
            if(varInEgal != null) {
                if(!"Int".equals(varInEgal.type)) {
                    SymbolTable.error(ctx,ctx.INT().getSymbol()  ,"Cannot compare " + varInEgal.type + " with Int"  );

                }
            }
            if(varInEgal == null) {
                varInEgal = new ScopVariabila(ctx.INT().getText(),"Int");
            }
        }


    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitIntt(CoolParser.InttContext ctx) {
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
     @Override public void enterCasee(CoolParser.CaseeContext ctx) { casee = true; salvari.put("case",ctx.CASE().getSymbol());}
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
    @Override public void exitCasee(CoolParser.CaseeContext ctx) { casee = false;
     caseReturnType = "ceva";
        if(caseVars.size()==1) {
            caseReturnType = caseVars.get(0);
            caseVars = new ArrayList<>();
            return;
        }
        if(caseVars.stream().filter(x -> !SymbolTable.isBuiltIn(x)).collect(Collectors.toList()).size() == 0) {
            caseReturnType = "Object";
            caseVars = new ArrayList<>();
            return;
        }
        if((new HashSet<>(caseVars.stream().map(this::getRealParent).collect(Collectors.toList()))).size() == 1) {
            caseReturnType = getRealParent(caseVars.get(0));
        }
        caseVars = new ArrayList<>();
     }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
    @Override public void enterTil(CoolParser.TilContext ctx) { unar = true;unarsemn = "~";
        returnTypeExpresie = "Bool";

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitTil(CoolParser.TilContext ctx) { unar = false; }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void enterParan(CoolParser.ParanContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitParan(CoolParser.ParanContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */

    @Override public void enterEgal(CoolParser.EgalContext ctx) {
        egal = true;
        salvari.put("=",ctx.EGALITATE().getSymbol());
        returnTypeExpresie = "Bool";

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitEgal(CoolParser.EgalContext ctx) {egal = false; varInEgal = null;
    returnTypeExpresie = null;
    }

   @Override public void enterIneg(CoolParser.InegContext ctx) {
        ineg = true;
        inegOp = ctx.INEGALITATI().getText();
       returnTypeExpresie = "Bool";



   }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
    @Override public void exitIneg(CoolParser.InegContext ctx) { ineg = false;  varInEgal = null;   returnTypeExpresie = null;
    }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
@Override public void enterIfthen(CoolParser.IfthenContext ctx) {
        ifthen = true;
}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitIfthen(CoolParser.IfthenContext ctx) { }
    @Override public void enterIfelse(CoolParser.IfelseContext ctx) { ifelse = true; }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitIfelse(CoolParser.IfelseContext ctx) { }

@Override public void enterIfbody(CoolParser.IfbodyContext ctx) {
        ifbody = true;
}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitIfbody(CoolParser.IfbodyContext ctx) { ifbody = false;
        String name = varAtrib.peek();
        final String[] type = new String[1];
        Optional.ofNullable(curentClass.atribute.get(name)).ifPresent(x -> type[0] = x.type);
        Optional.ofNullable(curentFunction).ifPresent(x -> Optional.ofNullable(x.variabileFormale.get(name)).ifPresent(xx -> type[0] = xx));




        if(!thenType.equals(elseType)) {
            SymbolTable.error(ctx,salvari.get("if") ,"Type Object of assigned expression is incompatible with declared type " + type[0] + " of identifier " +  varAtrib.peek() );
            functieReturnType = "Object";
        }
        ifelse = false;
        ifthen = false;
        returnTypeExpresie = null;
    }
    @Override public void enterIfcond(CoolParser.IfcondContext ctx) {
        ifcond = true;
        salvari.put("if",ctx.IF().getSymbol());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitIfcond(CoolParser.IfcondContext ctx) {ifcond = false; }
     @Override public void enterIfthenelse(CoolParser.IfthenelseContext ctx) { ifel = true;
    }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
    @Override public void exitIfthenelse(CoolParser.IfthenelseContext ctx) { ifel = false; }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
    @Override public void enterLet(CoolParser.LetContext ctx) {
        curentLet = new ScopLet();
        salvari.put("let",ctx.LET().getSymbol());
    }
    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
    @Override public void exitLet(CoolParser.LetContext ctx) {errorlet = false; curentLet = null; }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
    @Override public void enterAtribuire(CoolParser.AtribuireContext ctx) {
        atribuire = true;
        varAtrib.push(ctx.ID().getText());
        if(ctx.ID().getText().equals("self")) {
            SymbolTable.error(ctx,ctx.ID().getSymbol()  ,"Cannot assign to self"  );
            atribuire = false;
            return;
        }


    }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
    @Override public void exitAtribuire(CoolParser.AtribuireContext ctx) { atribuire = false;
        final String[] type = new String[1];
        String varAtrib1 = null;
        if(varAtrib.size() > 0) {
            varAtrib1 = varAtrib.peek();
        }
        Optional.ofNullable(curentClass.atribute.get(varAtrib1)).ifPresent(x -> type[0] = x.type);
        String finalVarAtrib = varAtrib1;
        Optional.ofNullable(curentFunction).ifPresent(x -> Optional.ofNullable(x.variabileFormale.get(finalVarAtrib)).ifPresent(xx -> type[0] = xx));


        if(blockReturnType !=  null && !block) {

                if (!type[0].equals(blockReturnType)) {
                    SymbolTable.error(ctx, salvari.get("block"), "Type " + blockReturnType + " of assigned expression is incompatible with declared type " + type[0] + " of identifier " + varAtrib.peek());
                    blockReturnType = null;
                    returnTypeExpresie = null;
                    return;
                }
            }
        if(letReturnType !=  null && !letcorp) {

            if (!type[0].equals(letReturnType)) {
                SymbolTable.error(ctx, salvari.get("let"), "Type " + letReturnType + " of assigned expression is incompatible with declared type " + type[0] + " of identifier " + varAtrib.peek());
                letReturnType = null;
                returnTypeExpresie = null;
                return;
            }
        }
            if(caseReturnType != null) {
                if (!type[0].equals(caseReturnType)) {
                    SymbolTable.error(ctx, salvari.get("case"), "Type " + caseReturnType + " of assigned expression is incompatible with declared type " + type[0] + " of identifier " + varAtrib.peek());
                    caseReturnType = null;
                    returnTypeExpresie = null;
                    return;
                }
            }


            if(returnTypeExpresie != null) {
              //  System.out.println(returnTypeExpresie);
                if (!type[0].equals(returnTypeExpresie)) {
                    if(type[0].equals(mostenire.get(returnTypeExpresie)) || returnTypeExpresie.equals(mostenire.get(type[0]))) {
                        return;
                    }
                    SymbolTable.error(ctx, ctx.ID().getSymbol(), "Type " + returnTypeExpresie + " of assigned expression is incompatible with declared type " + type[0] + " of identifier " + varAtrib.peek());
                    returnTypeExpresie = null;
                }
            }
        if(varAtrib.size() > 0) {
            varAtrib.pop();

        }
            returnTypeExpresie = null;

    }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
    @Override public void enterId(CoolParser.IdContext ctx) {
        String name = ctx.ID().getText();

        final String[] type = new String[1];
        Optional.ofNullable(curentClass.atribute.get(name)).ifPresent(x -> type[0] = x.type);
        Optional.ofNullable(curentFunction).ifPresent(x -> Optional.ofNullable(x.variabileFormale.get(name)).ifPresent(xx -> type[0] = xx));
        Optional.ofNullable(curentLet).ifPresent(x -> Optional.ofNullable(x.letVars.get(name)).ifPresent(xx -> type[0] = xx));
        String namePrimul = null;
        if(varAtrib.size() > 0) {
            namePrimul = varAtrib.peek();
        }
        final String[] typePrimul = new String[1];
        Optional.ofNullable(curentClass.atribute.get(namePrimul)).ifPresent(x -> typePrimul[0] = x.type);
        String finalNamePrimul = namePrimul;
        Optional.ofNullable(curentFunction).ifPresent(x -> Optional.ofNullable(x.variabileFormale.get(finalNamePrimul)).ifPresent(xx -> typePrimul[0] = xx));

        if(errorlet) return;
        if(block) {
            blockReturnType = type[0];
        }
        if(casebody) {
            caseVars.add(type[0]);
        }
        if(ifel) {
            if(ifthen) {
                thenType = type[0];
            }
            if(ifelse) {
                elseType = type[0];
            }
            if(ifcond) {
                if(!type.equals("Bool") && returnTypeExpresie ==  null  ) {
                    SymbolTable.error(ctx,ctx.ID().getSymbol()  ,"If condition has type " + type[0] + " instead of Bool"  );

                }
            }

        }
        if(whilehead) {

            if(!type[0].equals("Bool") && returnTypeExpresie ==  null) {
                SymbolTable.error(ctx,ctx.ID().getSymbol()  ,"While condition has type " + type[0] + " instead of Bool"  );
                    return;
            }
        }

        if(atribuire) {
            if(casee) {
                return;
            }
            if(letbody) {return;}
            if(!type[0].equals(typePrimul[0])) {
                if(typePrimul[0].equals(mostenire.get(type[0]))) {
                    return;
                }
                if(ifel) {
                    SymbolTable.error(ctx,salvari.get("if")  ,"Type " + type[0] + " of assigned expression is incompatible with declared type "
                            + typePrimul[0] + " of identifier " + namePrimul );
                    return;
                }
                if(letcorp) {
                    return;
                }
                SymbolTable.error(ctx,ctx.ID().getSymbol()  ,"Type " + type[0] + " of assigned expression is incompatible with declared type "
                        + typePrimul[0] + " of identifier " + namePrimul );
            }
        }
        if(unar) {
            if(returnTypeExpresie == null) {
                SymbolTable.error(ctx,ctx.ID().getSymbol()  ,"Operand of " + unarsemn + " has type " + curentClass.atribute.get(ctx.ID().getText()).type + " instead of Bool"  );
            }

        }

        if(letbody) {
            if(!curentFunction.variabileFormale.containsKey(ctx.ID().getText())) {
                SymbolTable.error(ctx,ctx.ID().getSymbol()  ,"Undefined identifier " + ctx.ID().getText()  );
                errorlet = true;
                return;
            }
        }
        if(aritm) {
                if(!"Int".equals(type[0])) {
                SymbolTable.error(ctx,ctx.ID().getSymbol()  ,"Operand of " + semn + " has type " + curentClass.atribute.get(ctx.ID().getText()).type + " instead of Int"  );

            }
        }
        if(ineg) {

            Optional.ofNullable(curentClass.atribute.get(ctx.ID().getText())).ifPresent(x -> {
                if(!"Int".equals(x.type)) {
                    SymbolTable.error(ctx, ctx.ID().getSymbol(), "Operand of " + inegOp + " has type " + curentClass.atribute.get(ctx.ID().getText()).type + " instead of Int");

                }});
        }
        if(egal) {
            if(varInEgal != null) {
                if(!SymbolTable.isBuiltIn(curentClass.atribute.get(ctx.ID().getText()).type)) {
                    return;
                }
                if(!curentClass.atribute.get(ctx.ID().getText()).type.equals(varInEgal.type)) {
                    SymbolTable.error(ctx,salvari.get("=")  ,"Cannot compare " + varInEgal.type + " with " + curentClass.atribute.get(ctx.ID().getText()).type);

                }
            }
            if(varInEgal == null) {
                varInEgal = curentClass.atribute.get(ctx.ID().getText());
            }
        }
    }
    @Override public void enterLetcorp(CoolParser.LetcorpContext ctx) {
        letcorp = true;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitLetcorp(CoolParser.LetcorpContext ctx) {
        letcorp = false;
    }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
   @Override public void exitId(CoolParser.IdContext ctx) {

   }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void enterObjfunccall(CoolParser.ObjfunccallContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitObjfunccall(CoolParser.ObjfunccallContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
    @Override public void enterLetbody(CoolParser.LetbodyContext ctx) {

        String id = ctx.ID().getText();
        String type = ctx.TYPE().getText();
        letbody = true;
        varAtrib.push(id);
        curentLetVar = id;
        curentLet.letVars.put(id,type);
        if(!global.values().stream().map(x -> x.getName()).collect(Collectors.toList()).contains(type)
                && !SymbolTable.isBuiltIn(type)) {

            SymbolTable.error(ctx,ctx.TYPE().getSymbol()  ,"Let variable "+ id + " has undefined type " + type );
            errorlet = true;
            return;
        }


    }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
    @Override public void exitLetbody(CoolParser.LetbodyContext ctx) { letbody = false; if(varAtrib.size() > 0) { varAtrib.pop();}
    curentLetVar = null;}
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
    @Override public void enterCasebody(CoolParser.CasebodyContext ctx) {
        String id = ctx.ID().getText();
        String type = ctx.TYPE().getText();
        casebody = true;

        if(!global.values().contains(type)
                && !SymbolTable.isBuiltIn(type) &&!type.equals("SELF_TYPE") ) {

            SymbolTable.error(ctx,ctx.TYPE().getSymbol()  ,"Case variable "+ id + " has undefined type " + type );
            return;
        }
    }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
    @Override public void exitCasebody(CoolParser.CasebodyContext ctx) {casebody = false; }
//
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void enterEveryRule(ParserRuleContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitEveryRule(ParserRuleContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void visitTerminal(TerminalNode node) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void visitErrorNode(ErrorNode node) { }
//}
}