public class Main {

    private static final String[] UNITS = {
        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
        "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
        "seventeen", "eighteen", "nineteen"
    };

    private static final String[] TENS = {
        "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    private static final String[] THOUSANDS = {
        "", "thousand", "million", "billion"
    };

    public static String convertToWords(int num) {
        if (num == 0) return "zero";
        if (num < 0) return "negative " + convertToWords(-num);

        StringBuilder words = new StringBuilder();
        int chunkIndex = 0;

        while (num > 0) {
            int remainder = num % 1000;
            if (remainder != 0) {
                StringBuilder chunk = new StringBuilder();
                
                // Process hundreds
                if (remainder >= 100) {
                    chunk.append(UNITS[remainder / 100]).append(" hundred ");
                    remainder %= 100;
                }
                
                // Process tens and units
                if (remainder >= 20) {
                    chunk.append(TENS[remainder / 10]).append(" ");
                    if (remainder % 10 > 0) {
                        chunk.append(UNITS[remainder % 10]).append(" ");
                    }
                } else if (remainder > 0) {
                    chunk.append(UNITS[remainder]).append(" ");
                }

                // Append scale (thousand, million, etc.)
                if (THOUSANDS[chunkIndex].length() > 0) {
                    chunk.append(THOUSANDS[chunkIndex]).append(" ");
                }

                // Insert chunk at the beginning
                words.insert(0, chunk);
            }

            num /= 1000;
            chunkIndex++;
        }

        return words.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(convertToWords(1234));       // one thousand two hundred thirty four
        System.out.println(convertToWords(12345));      // twelve thousand three hundred forty five
        System.out.println(convertToWords(1000005));    // one million five
    }
}