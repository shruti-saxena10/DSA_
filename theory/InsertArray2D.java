package com.array.theory;

public class InsertArray2D {

    int[][] arr2D=null;

    //constructor
    public InsertArray2D(int row, int col){
        arr2D=new int[row][col];
        for(int i=0;i< arr2D.length;i++){
            for(int j=0;j<arr2D[0].length;j++){
                arr2D[i][j]=Integer.MIN_VALUE;
            }
        }
    }

    public void insertarray2D(int row2D, int col2D, int value2D){
        try{
            if (arr2D[row2D][col2D]==Integer.MIN_VALUE){
                arr2D[row2D][col2D]=value2D;
                System.out.println("Successfully Inserted!! "+arr2D[row2D][col2D]);
            }
            else{
                System.out.println("Already Occupied");
            }
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Index out of range");
        }
    }

    public static void main(String[] args) {
        InsertArray2D isa2D=new InsertArray2D(6,6);
        isa2D.insertarray2D(7,4,10);
        isa2D.insertarray2D(4,4,11);
    }

}
