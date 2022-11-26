package com.java.logicmojo.recursion;

import java.util.ArrayList;
import java.util.List;

public class NQueensBruteForce {

    public static List<List<String>> solveNQueens(int N){

        char[][] board = new char[N][N];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                board[i][j] = '#';
            }
        }

        List<List<String>> result = new ArrayList<>();
        solveNQueensUtil(board, result, 0);
        return result;
    }

    public static void solveNQueensUtil(char[][] board, List<List<String>> result, int col){
        //base condition//
        if(col == board.length) {
            result.add(modifyResult(board));
            return;
        }

        for(int row = 0; row < board.length; row ++){
            if(validatePosition(board, row, col)){
                board[row][col] = 'Q';
                solveNQueensUtil(board, result, col+1);
                board[row][col] = '#';
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

    private static boolean validatePosition(char[][] board, int row, int col){
        int row1 = row;
        int col1 = col;

        //left-top diagonal//
        while(row >= 0 && col >= 0){
            if(board[row][col] == 'Q') return false;
            row --;
            col --;
        }

        //left- check//
        row = row1;
        col = col1;

        while(col >= 0){
            if(board[row][col] == 'Q') return false;
            col --;
        }

        //left-bottom-check//
        row = row1;
        col = col1;

        while(row < board.length && col >= 0){
            if(board[row][col] == 'Q') return false;
            row++;
            col--;
        }
        return true;
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
