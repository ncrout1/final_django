// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.HashMap;
import java.util.Map;
class Main {
    public static void main(String[] args) {
    String a= "narsingh";
    Map<Character,Integer> val=new HashMap<>();
    
    for (char c: a.toCharArray())
        {
            
            val.put(c,val.getOrDefault(c,0)+1);
            
        }
        
    for (Map.Entry<Character, Integer> var :val.entrySet())
        {
            System.out.println(var.getKey());
        }
    }
    
}

