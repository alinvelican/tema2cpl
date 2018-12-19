package cool.structures;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ScopClass {
    String name;

    public ScopClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Map<String , ScopFunctie> functii = new LinkedHashMap<>();
    public Map<String, String> functieReturnType = new LinkedHashMap<>();
    public Map<String,ScopVariabila> atribute = new LinkedHashMap<>();



}
