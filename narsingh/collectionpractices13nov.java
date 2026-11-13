// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        System.out.println("Try clicking the Run button.");
        HashMap <String, Integer> map= new HashMap<>();
        map.put("Narsingh",1);
        for (String a: map.keySet())
            {
                System.out.println(map.get(a));
            }
       List <Integer> array= new ArrayList<>();
        array.add(1);
        for (Integer a: array)
            {
                System.out.println(a);
            }
    }
}