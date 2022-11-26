package com.java.logicmojo.recursion;

import java.util.ArrayList;
import java.util.List;

public class NQueensOptimised {

    public static List<List<String>> solveNQueens(int N){

        char[][] board = new char[N][N];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                board[i][j] = '#';
            }
        }

        List<List<String>> result = new ArrayList<>();
        int left[] = new int[N];
        int upperDiagonal[] = new int[2*N-1];
        int lowerDiagonal[] = new int[2*N-1];
        solveNQueens(0, board, result, left, upperDiagonal, lowerDiagonal);
        return result;
    }

    public static void solveNQueens(int col, char[][] board, List<List<String>> res, int[] leftRow, int[] upperDiamgonal, int[] lowerDiagonal ){
        //base condition//
        if(col == board.length){
            res.add(modifyResult(board));
            return;
        }

        for(int row = 0; row < board.length; row ++){
            if(leftRow[row] == 0 && lowerDiagonal[row+col] == 0 && upperDiamgonal[board.length -1 + col - row] == 0){
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagonal[row+col] = 1;
                upperDiamgonal[board.length -1 + col - row] = 1;
                solveNQueens(col+1, board, res, leftRow, upperDiamgonal, lowerDiagonal);
                board[row][col] = '#';
                leftRow[row] = 0;
                lowerDiagonal[row+col] = 0;
                upperDiamgonal[board.length -1 + col - row] = 0;

            }
        }
    }

    private static List<String> modifyResult(char[][] board){
        List<String> res = new ArrayList<>();
        for(int i = 0; i < board.length; i++){
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
    public static void main(String[] args) {
        int N = 4;
        List<List<String>> result = solveNQueens(N);
        int i = 1;
        for(List<String> it: result){
            System.out.println("Valid Arrangement :: "+i);
            for(String s: it){
                System.out.println(s);
            }
            System.out.println();
            i++;
        }

    }
}
