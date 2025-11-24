public class StringAlgorithms {

    /**
     * Challenge 1:
     * Write a method that takes a String 'word' and returns
     * a String where each character is placed on its own line.
     */
     public static String printCharacters(String word) {
        // TODO: Implement this method
        String stringA = "";
        for (int i = 0; i <= word.length() - 1; i++) {
          // System.out.println(word.substring(i, i + 1));
            stringA += word.substring(i, i + 1) + "\n";
        }
        return stringA;
    }


    /**
     * Challenge 2:
     * Write a method that takes a String 'word' and returns
     * a new String with the characters reversed.
     */
    public static String reverseWord(String word) {
        // TODO: Implement this method
        String printB = "";
        for (int n = word.length(); n > 0; n--) {
        printB += word.substring((n - 1), n);
        }
        return printB;
    }


    /**
     * Challenge 3:
     * Write a method that takes a String 'sentence' and returns
     * the sentence with the first letter of each word capitalized.
     */
    public static String capitalizeString(String sentence) {
        // TODO: Implement this method
        String printC = (sentence.substring(0, 1)).toUpperCase();
        for (int r = 1; r < sentence.length(); r++) {
         if (sentence.substring(r, (r+1)).equals(" ")) {
            printC += " " + (sentence.substring((r + 1), (r + 2))).toUpperCase();
            r++;
         } else {
         printC += sentence.substring(r, (r + 1));
         }
        
        }
        
        return printC;
    }


    /**
     * Challenge 4:
     * Write a method that takes a String 'word' and returns true
     * if the word is a palindrome (ignoring case), false otherwise.
     */
    public static boolean detectPalindrome(String word) {
        // TODO: Implement this method
        return false;
    }


    /**
     * Challenge 5:
     * Write a method that takes a String 'word' and returns the
     * first character that appears exactly once. If no such
     * character exists, return a space ' '.
     */
    public static char firstUniqueChar(String word) {
        // TODO: Implement this method
        return ' ';
    }


    /**
     * Main method:
     * Test each method at least once.
     */
    public static void main(String[] args) {

        // TODO: Add test calls for each challenge method
        
        System.out.println("Testing printCharacters:");
        // Example:
        // System.out.println(printCharacters("hello"));
        System.out.println(printCharacters("hello"));
        
        System.out.println("\nTesting reverseWord:");
        // Example:
        // System.out.println(reverseWord("hello"));
        System.out.println(reverseWord("hello"));
        System.out.println("\nTesting capitalizeString:");
        // Example:
        // System.out.println(capitalizeString("the quick brown fox"));
         System.out.println(capitalizeString("brave new world"));

        System.out.println("\nTesting detectPalindrome:");
        // Example:
        // System.out.println(detectPalindrome("racecar"));

        System.out.println("\nTesting firstUniqueChar:");
        // Example:
        // System.out.println(firstUniqueChar("swiss"));
    }
}
