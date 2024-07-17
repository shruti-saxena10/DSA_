package com.array.theory;

import java.util.Arrays;

public class AccessArray2D {

    public static void accessCell(int[][] array2D,int row, int col){

        //Accessing row
        System.out.println("Accessing row "+row+col);
        //Cell value is
        System.out.println("Cell value is "+array2D[row][col]);
    }


    public static void main(String[] args) {
        int[][] accessarray2D={{1,2},{34,55}};
        accessCell(accessarray2D,1,1);

    }
}
