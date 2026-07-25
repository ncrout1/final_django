// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int [] array={1,2,3,5,6};
        int start=0;
        int temp =0;
        int arrayLen=array.length-1;
        while (start<arrayLen)
        {
            temp =array[start];
            array[start]=array[arrayLen];
            array[arrayLen]=temp;
            
            start=start+1;
            arrayLen=arrayLen-1;
        }
        
        for (int i =0;i<array.length;i++)
        
        {
            System.out.println(array[i]);
        }
        System.out.println("Start small. Ship something.");
    }
}