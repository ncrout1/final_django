

public class Main
{
   public static  void main(String [] args)
    { 
        
        int [] array={1,2,44,5,66,67,7};
        int maxelem=array[0];
      for (int i=1;i<array.length;i++)
      { 
          
          if (array[i]>maxelem)
          {
              
              maxelem=array[i];
          }
        //   System.out.println(array[i]);
          
      }
      
      System.out.println(maxelem);
        System.out.println("Narsingh");
    }}