import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> match_finder = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (match_finder.containsKey(nums[i])) {
                return new int[]{match_finder.get(nums[i]), i};
            } else match_finder.put(target - nums[i], i);
        }
        return nums;
    }
}
