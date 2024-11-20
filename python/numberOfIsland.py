from typing import List


class Solution:

    def visit(self, grid: List[List[str]], vm: List[List[int]], row: int, col: int, v_row: int, v_col: int):
        vm[v_row][v_col] = 1
        can_go_up = v_row - 1 >= 0
        can_go_down = v_row + 1 <= row
        can_go_left = v_col - 1 >= 0
        can_go_right = v_col + 1 <= col

        if can_go_up and grid[v_row - 1][v_col] == '1' and vm[v_row - 1][v_col] == 0:
            self.visit(grid, vm, row, col, v_row - 1, v_col)
        if can_go_down and grid[v_row + 1][v_col] == '1' and vm[v_row + 1][v_col] == 0:
            self.visit(grid, vm, row, col, v_row + 1, v_col)
        if can_go_left and grid[v_row][v_col - 1] == '1' and vm[v_row][v_col - 1] == 0:
            self.visit(grid, vm, row, col, v_row, v_col - 1)
        if can_go_right and grid[v_row][v_col + 1] == '1' and vm[v_row][v_col + 1] == 0:
            self.visit(grid, vm, row, col, v_row, v_col + 1)

    def numIslands(self, grid: List[List[str]]) -> int:
        rows = len(grid)
        cols = len(grid[0])
        vm = []
        count = 0
        for r in range(rows):
            vm.append([0] * cols)

        for r_index in range(rows):
            for c_index in range(cols):
                if grid[r_index][c_index] == '1' and vm[r_index][c_index] == 0:
                    count += 1
                    self.visit(grid, vm, rows - 1, cols - 1, r_index, c_index)
        return count


if __name__ == '__main__':
    print(Solution().numIslands([['1', '0', '1'], ['1', '1', '0']]))
