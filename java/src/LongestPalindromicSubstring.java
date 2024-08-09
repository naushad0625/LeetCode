public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "shhsrbddbrsNitinnitin";
        String res = longestPalindrome(s);
        System.out.println(res);
    }

    public static String longestPalindrome(String s) {
        int str_len = s.length();
        int longest_pal_len = 0;
        int left = 0, right = 0;

        String s1 = s.toLowerCase();

        if (str_len == 0) return "";

        for (int i = 0; i < str_len; i++) {
            for (int j = i + 1; j < str_len; j++) {
                int len = ifPalindromeThenLength(s1, i, j);
                if (len > longest_pal_len) {
                    left = i;
                    right = j;
                    longest_pal_len = len;
                }
            }
        }

        return s.substring(left, right+1);

    }

    private static int ifPalindromeThenLength(String s, int left, int right) {
        int lenght = right - left + 1;
        while (left <= right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else return 0;
        }
        return lenght;
    }
}
