//public class SearchInRotatedSortedArray {
//    public static void main(String[] args) {
//        int[] nums = {4, 5, 1, 2, 3};
//        int target = 2;
//        System.out.println(search(nums, target));
//    }
//
//
//    public static int binarySearch(int[] nums, int left, int right, int target) {
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (target == nums[mid]) return mid;
//            else if (target > nums[mid]) left = mid + 1;
//            else right = mid - 1;
//
//        }
//        return -1;
//    }
//
//    public static int search(int[] nums, int target) {
//        if (nums.length == 0) return -1;
//
//        int low = 0;
//        int high = nums.length - 1;
//        int left = 0;
//        int right = nums.length - 1;
//        int pivot = 0;
//
//        while (left < right) {
//            pivot = left + (right - left) / 2;
//            if (nums[pivot] > nums[left])
//                left = pivot;
//            else right = pivot;
//
//        }
//
//        pivot = right;
//
//        if (low == pivot && target == nums[pivot]) return pivot;
//        else if (high == pivot + 1 && target == nums[high]) return high;
//
//        int left_subtree_res = binarySearch(nums, low, pivot, target);
//
//        if (left_subtree_res != -1) return left_subtree_res;
//
//        int right_subterr_res = binarySearch(nums, pivot + 1, high, target);
//
//        return right_subterr_res;
//    }
//}

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {5, 4, 6, 7, 0, 1, 2};
        int target = 0;

        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {

        int length = nums.length;

        if (length == 0) return -1;

        if (nums[0] < nums[length - 1]) return binarySearch(nums, 0, length - 1, target);

        int pivot = findPivot(nums, 0, length - 1);

        if (target >= nums[0]) return binarySearch(nums, 0, pivot, target);

        return binarySearch(nums, pivot + 1, length - 1, target);

    }

    private static int findPivot(int[] nums, int left, int right) {
        while (left < right) {
            int pivot = left + (right - left) / 2;
            if (nums[pivot] > nums[left])
                left = pivot;
            else right = pivot;
        }
        return left;
    }

    private static int binarySearch(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) return mid;
            else if (target > nums[mid]) left = mid + 1;
            else right = mid - 1;

        }
        return -1;
    }
}
