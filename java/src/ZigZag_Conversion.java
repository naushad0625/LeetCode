public class ZigZag_Conversion {

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        String res = convert(s, numRows);

        System.out.println(res.equals("PINALSIGYAHRPI"));
    }

    public static String convert(String s, int numRows) {
        boolean down = true;
        boolean up = false;

        int downSteps = numRows;
        int upSteps = numRows - 2;
        int index = 0;

        String[] strs = new String[numRows];
        String res = "";


        for (int i = 0; i < numRows; i++) {
            strs[i] = "";
        }

        while (index < s.length()) {
            if (down) {
                for (int i = 0; i < downSteps; i++) {
                    if (index >= s.length()) break;
                    strs[i] = strs[i] + s.charAt(index);
                    index++;
                }
                down = false;
                up = true;
            }
            if (up) {
                for (int i = numRows - 2; i > 0; i--) {
                    if (index >= s.length()) break;
                    strs[i] = strs[i] + s.charAt(index);
                    index++;
                }
                up = false;
                down = true;
            }
        }

        for (int i = 0; i < numRows; i++) {
            res += strs[i];
        }
        return res;
    }
}

