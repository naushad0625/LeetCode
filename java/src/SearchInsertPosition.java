public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;

        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0) return 0;
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == nums[mid]) return mid;

            if (target < nums[mid]) {
                high = mid - 1;
            } else low = mid + 1;

        }

        return low;
    }
}
