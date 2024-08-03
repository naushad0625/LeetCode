public class Longest_Substring_Without_Repeating_Characters {


    public static void main(String[] args) {
        String s = "w world";
        int length = lengthOfLongestSubstring(s);
        System.out.println(length);

    }

    public static int lengthOfLongestSubstring(String s) {

        int left;
        int right;
        int length = 0;
        int char_index = 256;
        int str_len = s.length();

        if (s.length() < 1) return 0;

        for (left = 0; left < str_len; left++) {

            boolean[] arr = new boolean[257];

            for (right = left; right < str_len; right++) {

                char_index = s.charAt(right);

                if (arr[char_index]) break;
                else {
                    arr[char_index] = true;
                    length = Integer.max(length, right - left + 1);
                }
            }

        }
        return length;
    }
}
