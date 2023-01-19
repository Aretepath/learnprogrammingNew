import java.util.HashMap;
import java.util.Map;

public class MapProgram {


    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compuled high level, object-oriented, platform independent language");
        languages.put("Python", "an indepreted, object-oriented, high level programging language with dynamic symantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about java");
        }
        System.out.println(languages.get("========================="));

        //languages.remove("Lisp");
        if(languages.remove("Algol", "a family of algorithmic languages")){
            System.out.println("Algol removed");
        }else {
            System.out.println("Algol not removed key value pair not found");
        }

        System.out.println(languages.replace("Lisp", "a functional programming language with imper"));
        System.out.println(languages.replace("Scala", "this will not be added!"));
        for(String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
