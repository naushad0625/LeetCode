from typing import List


class Solution:
    @staticmethod
    def calculate_area(left_height: int, right_height: int, distance: int):
        return left_height * distance if left_height < right_height else right_height * distance

    def maxArea(self, height: List[int]) -> int:
        left: int = 0
        right: int = len(height) - 1

        area: int = 0

        while left < right:
            temp_area = self.calculate_area(height[left], height[right], right - left)
            area = temp_area if temp_area > area else area
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return area


if __name__ == "__main__":
    sol = Solution()
    print(sol.maxArea([3, 4, 8, 4, 7, 8, 4]))
