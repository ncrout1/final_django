class Main {
    public static void main(String[] args) {
        String about="My name is khan";
        String [] arrayes =about.split(" ");
        for (String val : arrayes)
            {
                System.out.println(val);
                System.out.println("string length:"+val.length());
            }
        System.out.println("Try clicking the Run button.");
    }
}