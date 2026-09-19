/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
public class narsingh{
    public int hello()
    {
        System.out.println("Hello");
        return 1;
    }
}
public class hemant extends narsingh{
    public int hello()
    {
        System.out.println("Narsingh");
        return 2;
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		narsingh obj1= new narsingh();
		obj1.hello();
		
		
		
	}
}