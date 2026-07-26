// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int [] array={1,3,4,0};
        int arraylength=array.length+1;
        int [] newarray=new int [arraylength];
        for(int i=0;i<array.length;i++)
        {
            newarray[array[i]]+=1;
        }
        for (int j=0;j<arraylength;j++)
        {
            if(newarray[j]==0)
            {
                System.out.println(j);
            }
        }
        System.out.println("Start small. Ship something.");
        
    }
}