package com.array.theory;

public class DeleteArray2D {
    public int deleteArrayElement2D(int[][] deleteArray2D, int row, int col){
        deleteArray2D[row][col]=Integer.MIN_VALUE;
        System.out.println("Successfully deleted!! "+deleteArray2D[row][col]);
        return deleteArray2D[row][col];

    }
    public static void main(String[] args) {
        int[][] deleteArray2D={{12,15,17},{18,102,50}};
        DeleteArray2D dA2D=new DeleteArray2D();
        dA2D.deleteArrayElement2D(deleteArray2D,1,2);
    }
}
