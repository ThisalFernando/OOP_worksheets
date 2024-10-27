import java.util.StringTokenizer;

public class Q5 {

    private String sentence;
    private String text;


    //Default constructor
    public Q5(){};

    //Remove punctuation, spaces, and convert to lowercase
    public String cleanSentence(String sentence) {
        StringBuilder cleaned = new StringBuilder();
        StringTokenizer tokenizer = new StringTokenizer(sentence, " ,.!?;:\"'()[]{}");

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken().toLowerCase();  // Convert to lowercase
            cleaned.append(word);  // Append to the cleaned string
        }

        return cleaned.toString();
    }

    //Check if a string is a palindrome or not
    public boolean isPalindrome(String text) {
        int left = 0, right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                //False if it is not a palindrome
                return false;
            }
            left++;
            right--;
        }

        //True if it is a palindrome
        return true;
    }
}
