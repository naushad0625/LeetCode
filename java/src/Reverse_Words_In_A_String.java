public class Reverse_Words_In_A_String {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }

    // Using StringBuilder
    public static String reverseWords(String s) {
        String[] words = s.trim().split(" +");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length; i > 0; i--) {
            sb.append(words[i - 1] + " ");
        }
        return sb.toString().trim();
    }
    
}
