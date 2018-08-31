package com.searchinmatrix;

import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SearchInMatrix {


    boolean findSolutionOne(int matrix[][], int value) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = 0;
        int end = rows * cols - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int row = mid / cols;
            int col = mid % cols;
            int v = matrix[row][col];
            //System.out.println(start+", "+end+", "+mid+", "+row+", "+col+", "+v);
            if (v == value) return true;
            if (v > value) end = mid - 1;
            else start = mid + 1;
        }
        return false;
    }


    boolean findSolutionSec(int matrix[][], int value) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == value) {
                    return true;
                }
            }
        }
        return false;
    }
}
