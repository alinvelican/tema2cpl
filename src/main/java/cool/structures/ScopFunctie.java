package cool.structures;

import java.util.LinkedHashMap;
import java.util.Map;

public class ScopFunctie {
    String name;
    public Map<String ,String> variabileFormale = new LinkedHashMap<>();
    public String returnType;

    public ScopFunctie(String name,String returnType) {
        this.name = name;
        this.returnType = returnType;

    }

    public String getName() {
        return name;
    }
}
