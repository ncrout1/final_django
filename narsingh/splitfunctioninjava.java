class Main {
    public static void main(String[] args) {
        String about="My name is khan";
        String [] array =about.split(" ");
        for (String val : array)
            {
                System.out.println(val);
                System.out.println("string length:"+val.length());
            }
        System.out.println("Try clicking the Run button.");
    }
}