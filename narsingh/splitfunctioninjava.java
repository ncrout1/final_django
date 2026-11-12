class Main {
    public static void main(String[] args) {
        String about="My name is khan";
        String [] arrays =about.split(" ");
        for (String val : arrays)
            {
                System.out.println(val);
                System.out.println("string length:"+val.length());
            }
        System.out.println("Try clicking the Run button.");
    }
}