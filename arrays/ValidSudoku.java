// Problem: Valid Sudoku
// Pattern: 2D Array + HashSet (Multiple Dimensions)
// Difficulty: Medium
// Independence: Guided approach, self coded ✅
// LeetCode: #36
// Why: When validating uniqueness across multiple dimensions (rows, cols, boxes),
//      create separate HashSets per dimension and check all simultaneously in one pass.
//      Box index formula (i/3)*3 + (j/3) maps 2D coordinates to a single 1D index (0-8).

import java.util.HashSet;

class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] columns = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for(int i = 0; i < 9; i++){
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.')
                    continue;
                char c = board[i][j];
                int boxFormula = (i/3) * 3 + (j/3);
                if(rows[i].contains(c) || columns[j].contains(c) || boxes[boxFormula].contains(c))
                    return false;

                rows[i].add(c);
                columns[j].add(c);
                boxes[boxFormula].add(c);
            }
        }
        return true;
    }
}