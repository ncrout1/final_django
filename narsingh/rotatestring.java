public class Main {

    public static String reverse(String var) {
        String word = "";
        String newStr = "";

        // Iterate backwards through the input string
        for (int i = var.length() - 1; i >= 0; i--) {
            if (var.charAt(i) == ' ') {
                newStr += var.charAt(i);
                newStr += reverseTheWord(word);
                word = "";
            } else {
                word += var.charAt(i);
            }
        }
        
        // Reverse and attach the last remaining word
        newStr += reverseTheWord(word);

        return newStr;
    }

    public static String reverseTheWord(String word) {
        String newWord = "";
        
        // Iterate backwards through the word
        for (int i = word.length() - 1; i >= 0; i--) {
            newWord += word.charAt(i);
        }
        
        return newWord;
    }

    public static void main(String[] args) {
        String newString = reverse("My name is khan");
        System.out.println(newString);
    }
}