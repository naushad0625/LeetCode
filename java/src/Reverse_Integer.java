public class Reverse_Integer {
    public static void main(String[] args) {
        int x = Integer.MIN_VALUE;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {

        int f_result = 0;
        while (x != 0) {
            int mod = x % 10;
            int temp_res = f_result * 10 + mod;
            if ((temp_res - mod) / 10 != f_result)
                return 0;
            f_result = temp_res;
            x = x / 10;
        }

        return f_result;
    }
}
