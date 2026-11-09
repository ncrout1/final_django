import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String l = "My name is narsingh";
        String word = "";
        ArrayList<String> newarray = new ArrayList<>();

        for (int i = 0; i < l.length(); i++) {
            if (l.charAt(i) != ' ') {
                word += l.charAt(i);
            } else {
                int wordlen = word.length() - 1;
                int j = 0;
                String newword = "";

                while (j <= wordlen) {
                    newword += word.charAt(j);
                    j = j + 1;
                }
                newword += String.valueOf(wordlen + 1);
                newarray.add(newword);
                word = "";
            }
        }

        // Handling the last word after the loop finishes
        int wordlen = word.length() - 1;
        int j = 0;
        String newword = "";

        while (j <= wordlen) {
            newword += word.charAt(j);
            j = j + 1;
        }
        newword += String.valueOf(wordlen + 1);
        newarray.add(newword);
        String finalword =String.join(" ",newarray);
        System.out.println(finalword);
    }
}