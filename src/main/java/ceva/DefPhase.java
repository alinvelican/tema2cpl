package ceva;


import cool.parser.CoolParser;
import cool.parser.CoolParserBaseListener;
import cool.structures.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.util.LinkedHashMap;
import java.util.Map;

public class DefPhase extends CoolParserBaseListener {
    public Map<String, ScopClass> global = new LinkedHashMap<>();
    public Map<String,String> mostenire  = new LinkedHashMap<>();
    public Map<String, Token> salvari = new LinkedHashMap<>();
    public Map<String, ParserRuleContext> salvari2 = new LinkedHashMap<>();
    public ScopClass currentScopeClass;
    public ScopFunctie currentScopFunctie;
    private boolean add(String name,ScopClass scopClass) {
        if (global.containsKey(name))
            return false;

        global.put(name, scopClass);

        return true;
    }


    @Override public void enterProgram(CoolParser.ProgramContext ctx) {

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitProgram(CoolParser.ProgramContext ctx) {

  }
/**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterClassxx(CoolParser.ClassxxContext ctx) {
        String name = ctx.TYPE(0).getText();
        if(global.keySet().contains(name) || SymbolTable.isBuiltIn(name)) {
            SymbolTable.error(ctx,ctx.TYPE(0).getSymbol()  ,"Class "+  ctx.TYPE(0).getText() + " is redefined");
            return;
        }
        if(ctx.TYPE().size() > 1) {
            if(ctx.TYPE(1).getText().equals("SELF_TYPE") || SymbolTable.isBuiltIn(ctx.TYPE(1).getText())) {
                SymbolTable.error(ctx,ctx.TYPE(1).getSymbol()  ,"Class "+  ctx.TYPE(0).getText() + " has illegal parent " + ctx.TYPE(1).getText());
              //  return;
            }
        }

        if(name.equals("SELF_TYPE")) {
            SymbolTable.error(ctx,ctx.TYPE(0).getSymbol()  ,"Class has illegal name SELF_TYPE");
            return;
        }
        String nameInh = null;
        if(ctx.TYPE().size() > 1) {
            nameInh = ctx.TYPE(1).getText();

        }

        mostenire.put(name,nameInh);
        ScopClass scop = new ScopClass(name);
        add(name,scop);
        currentScopeClass = scop;
        salvari2.put(name,ctx);


    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitClassxx(CoolParser.ClassxxContext ctx) {

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFunctie(CoolParser.FunctieContext ctx) {
        String name = ctx.ID().getText();
        String returnType = ctx.TYPE().getText();

//        if(name.equals( "main")) {
//            main = true;
//        }
        if(currentScopeClass.functii.containsKey(name)) {
            SymbolTable.error(ctx,ctx.start,"Class " + currentScopeClass.getName() + " redefines method " + name );
            return;
        }
        ScopFunctie scopFunctie = new ScopFunctie(name,returnType);
        currentScopeClass.functii.put(name,scopFunctie);
        currentScopeClass.functieReturnType.put(name,returnType);
        currentScopFunctie = scopFunctie;


    }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitFunctie(CoolParser.FunctieContext ctx) { popScope();}
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
    @Override public void enterAtribut(CoolParser.AtributContext ctx) {

        String name = ctx.ID().getText();
        String type = ctx.TYPE().getText();
        if(currentScopeClass.atribute.containsKey(name)) {
            SymbolTable.error(ctx,ctx.ID().getSymbol(),"Class " + currentScopeClass.getName() + " redefines attribute " + name );
            return;
        }
        if(name.equals("self")) {
            SymbolTable.error(ctx,ctx.ID().getSymbol(),"Class " + currentScopeClass.getName() + " has attribute with illegal name " + name );
            return;
        }

        ScopVariabila scopVariabila = new ScopVariabila(name,type);
        currentScopeClass.atribute.put(name,scopVariabila);
    }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitAtribut(CoolParser.AtributContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
    @Override public void enterFormalxx(CoolParser.FormalxxContext ctx) {

        String name = ctx.ID().getText();
        if(name.equals("self")) {
            SymbolTable.error(ctx,ctx.ID().getSymbol(),"Method " +name + " of class " + currentScopeClass.getName() + " has formal parameter with illegal name " + name );
            return;
        }
        if(currentScopFunctie.variabileFormale.containsKey(name)) {
            SymbolTable.error(ctx,ctx.ID().getSymbol(),"Method " +currentScopFunctie.getName() + " of class " + currentScopeClass.getName() + " redefines formal parameter " + name );
            return;
        }
        String type = ctx.TYPE().getText();
        if(type.equals("SELF_TYPE")) {
            SymbolTable.error(ctx,ctx.TYPE().getSymbol(),"Method " +currentScopFunctie.getName() + " of class " +
                    currentScopeClass.getName() + " has formal parameter x with illegal type " + type );
            return;
        }

        currentScopFunctie.variabileFormale.put(name,type);
//        System.out.println(currentScopFunctie.variabileFormale);
    }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitFormalxx(CoolParser.FormalxxContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void enterNew(CoolParser.NewContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitNew(CoolParser.NewContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void enterMinus(CoolParser.MinusContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitMinus(CoolParser.MinusContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
    @Override public void enterString(CoolParser.StringContext ctx) { salvari.put(ctx.STRING().getText(),ctx.start);}
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitString(CoolParser.StringContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void enterBool(CoolParser.BoolContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitBool(CoolParser.BoolContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void enterFunccall(CoolParser.FunccallContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitFunccall(CoolParser.FunccallContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void enterIsvoid(CoolParser.IsvoidContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitIsvoid(CoolParser.IsvoidContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void enterInm(CoolParser.InmContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitInm(CoolParser.InmContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void enterBody(CoolParser.BodyContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitBody(CoolParser.BodyContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void enterImp(CoolParser.ImpContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitImp(CoolParser.ImpContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void enterPlus(CoolParser.PlusContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitPlus(CoolParser.PlusContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void enterWhileloop(CoolParser.WhileloopContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitWhileloop(CoolParser.WhileloopContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void enterNot(CoolParser.NotContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitNot(CoolParser.NotContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
   @Override public void enterIntt(CoolParser.InttContext ctx) {salvari.put(ctx.INT().getText(),ctx.start); }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitIntt(CoolParser.InttContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void enterCasee(CoolParser.CaseeContext ctx) {
//        String name = ctx.CASE().getText() + caseNr;
//
//        MethodSymbol methodSymbol = new MethodSymbol(name);
//        methodSymbol.setEnclosingScope(currentScope);
//
//        saveScope(ctx,methodSymbol);
//        pushScope(methodSymbol);
//    }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitCasee(CoolParser.CaseeContext ctx) {caseNr++; }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void enterTil(CoolParser.TilContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitTil(CoolParser.TilContext ctx) { }
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
//    @Override public void enterIneg(CoolParser.InegContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitIneg(CoolParser.InegContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void enterIfthenelse(CoolParser.IfthenelseContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitIfthenelse(CoolParser.IfthenelseContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void enterLet(CoolParser.LetContext ctx) {
//
//        String name = ctx.LET().getText() + let;
//
//        MethodSymbol methodSymbol = new MethodSymbol(name);
//        methodSymbol.setEnclosingScope(currentScope);
//
//        saveScope(ctx,methodSymbol);
//        pushScope(methodSymbol);
//
//    }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitLet(CoolParser.LetContext ctx) {
//        popScope();
//        let++;
//    }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void enterAtribuire(CoolParser.AtribuireContext ctx) {
//        String name = ctx.ID().getText();
//
//        if(name.equals("self")) {
//            SymbolTable.error(ctx,ctx.ID().getSymbol(),"Cannot assign to self" );
//            return;
//        }
//        FieldSymbol fieldSymbol = new FieldSymbol(name);
//        currentScope.define(fieldSymbol);
//    }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitAtribuire(CoolParser.AtribuireContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
    @Override public void enterId(CoolParser.IdContext ctx) { salvari.put(ctx.ID().getText(),ctx.start);}
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitId(CoolParser.IdContext ctx) { }
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
        String name = ctx.ID().getText();
        if(name.equals("self")) {
            SymbolTable.error(ctx,ctx.ID().getSymbol(),"Let variable has illegal name self" );
            return;
        }
        String type = ctx.TYPE().getText();

    }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitLetbody(CoolParser.LetbodyContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
    @Override public void enterCasebody(CoolParser.CasebodyContext ctx) {
        String name = ctx.ID().getText();
        if(name.equals("self")) {
            SymbolTable.error(ctx,ctx.ID().getSymbol(),"Case variable has illegal name self" );
            return;
        }
        String type = ctx.TYPE().getText();
        if(type.equals("SELF_TYPE")) {
            SymbolTable.error(ctx,ctx.TYPE().getSymbol(),"Case variable " + name + " has illegal type SELF_TYPE" );
            return;
        }

    }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitCasebody(CoolParser.CasebodyContext ctx) { }
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
}
