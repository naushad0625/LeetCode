from typing import List


class Solution:

    def binary_search(self, left: int, right: int, match_condition,
                      right_switch_condition) -> int:
        while left <= right:
            mid = left + int((right - left) / 2)
            if match_condition(mid):
                return mid
            elif right_switch_condition(mid):
                right = mid - 1
            else:
                left = mid + 1
        return -1

    def find_col(self, matrix: List[List[int]], target: int, row: int):
        right = len(matrix[row]) - 1
        col_index = self.binary_search(0, right, lambda mid: target == matrix[row][mid],
                                       lambda mid: target < matrix[row][mid])

        if col_index == -1:
            return False
        return True

    def find_row(self, matrix: List[List[int]], target: int):
        right = len(matrix) - 1
        row_index = self.binary_search(0, right,
                                       lambda mid: matrix[mid][0] <= target if mid == right else matrix[mid][
                                                                                                     0] <= target <
                                                                                                 matrix[mid + 1][0],
                                       lambda mid: target < matrix[mid][0])
        return row_index

    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if len(matrix[0]) == 0:
            return False
        expected_row = self.find_row(matrix, target, )
        return self.find_col(matrix, target, row=expected_row)


if __name__ == "__main__":
    print(Solution().searchMatrix([[]], 1))
