// Write a program to solve a Sudoku puzzle by filling the empty cells.

// A sudoku solution must satisfy all of the following rules:

// Each of the digits 1-9 must occur exactly once in each row.
// Each of the digits 1-9 must occur exactly once in each column.
// Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
// The '.' character indicates empty cells


class Solution {

    public boolean isPossible(char[][] board,int row,int col,char c){

        for(int i=0;i<9;i++){

            if(board[row][i]==c)
            return false;

            if(board[i][col]==c)
            return false;

            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==c)
            return false;
        }

        return true;

    }

    public boolean solve(char[][] board){

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                
                if(board[i][j]=='.'){
    for(char k='1';k<='9';k++){
                    if(isPossible(board,i,j,k)){
                        board[i][j]=k;

                        if(solve(board)==true)
                        return true;
                        
                        else
                        board[i][j]='.';
                    }

                }
                return false;
                }
            
                
            }
        }

        return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board);
        
    }
}