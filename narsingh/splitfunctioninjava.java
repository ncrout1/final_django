class Main {
    public static void main(String[] args) {
        String about="My name is khan";
        String [] arr =about.split(" ");
        for (String val : arr)
            {
                System.out.println(val);
                System.out.println("string length:"+val.length());
            }
        System.out.println("Try clicking the Run button.");
    }
}