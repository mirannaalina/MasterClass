package Section12;

import java.util.HashMap;
import java.util.Map;

public class Mapp {

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();

        languages.put("Java"," a compiled high level, oop programming lg");
        languages.put("Python", "interpreted, oop dynamic programming lg");
        System.out.println(languages.put("Algol", " an algorithmic lg"));
        languages.put("Lisp ", "bla bla");

        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        }else{
            languages.put("Java","bla bla bla");
        }
        System.out.println(languages.get("Java"));//specify the key (unique)
        languages.put("Java","again");
        System.out.println(languages.get("Java"));

        System.out.println("============================================");

        languages.remove("Algol");
        if(languages.remove("Lisp","bla bla")){
            System.out.println("algol removed");
        }else{
            System.out.println("Algot not removed");
        }
        for(String key : languages.keySet()){
            System.out.println(key+ ": "+ languages.get(key));

        }
    }
}
