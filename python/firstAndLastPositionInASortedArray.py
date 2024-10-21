from typing import List


class Solution:
    def binSearch(self, nums: List[int], target: int) -> int:
        if len(nums) == 0:
            return -1
        left: int = 0
        right: int = len(nums) - 1

        while left <= right:
            mid: int = int(left + (right - left) / 2)
            if target == nums[mid]:
                return mid
            elif target > nums[mid]:
                left = mid + 1
            else:
                right = mid - 1
        return -1

    def findStartEnd(self, nums: List[int], index: int, target: int) -> List[int]:
        left = index
        right: int = index

        while left >= 0 and right < len(nums) and target == nums[left] and target == nums[right]:
            left -= 1
            right += 1

        while left >= 0 and target == nums[left]:
            left -= 1
        while right < len(nums) and  target == nums[right]:
            right += 1

        return [left + 1, right - 1]

    def searchRange(self, nums: List[int], target: int) -> List[int]:
        index: int = self.binSearch(nums, target)
        if index < 0:
            return [-1, -1]

        return self.findStartEnd(nums, index, target)


if __name__ == "__main__":
    sol = Solution()
    print(sol.searchRange([8], 8))
