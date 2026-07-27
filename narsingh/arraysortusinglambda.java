public // Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int [] array={2,5,7,1,5,0};
        int [] [] paired=new int [array.length-1][2];
        
      for (int i=0;i<array.length-1;i++)
      {
          paired[i][0]=array[i];
          paired[i][1]=i;
      }
      
      Arrays.sort(paired, (a,b)->Integer.compare(a[0],b[0]));
      for(int [] ar:paired)
      {
          System.out.println(ar[0]+","+ar[1]);
      }
    }
} {
    
}
