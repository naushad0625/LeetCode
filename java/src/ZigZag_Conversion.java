import java.util.Arrays;

public class ZigZag_Conversion {

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        String res = convert(s, numRows);

        System.out.println(res.equals("PINALSIGYAHRPI"));
    }

    public static String convert(String s, int numRows) {

        int index = 0;

        String[] strs = new String[numRows];
        StringBuilder res = new StringBuilder();

        Arrays.fill(strs, "");

        while (index < s.length()) {

            for (int i = 0; i < numRows; i++) {
                if (index >= s.length()) break;
                strs[i] = strs[i] + s.charAt(index);
                index++;
            }

            for (int i = numRows - 2; i > 0; i--) {
                if (index >= s.length()) break;
                strs[i] = strs[i] + s.charAt(index);
                index++;
            }
        }

        for (int i = 0; i < numRows; i++) {
            res.append(strs[i]);
        }
        return res.toString();
    }
}

