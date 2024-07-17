package com.array.theory;
//Inserting elements in an array(new Array) and inserting elements
//Time Complexity=>O(1)
import java.util.Arrays;

public class InsertionArray {
    int[] arr=null;
    //constructor to initialize the array elements to in value

    public InsertionArray(int sizeOfArray){
        arr=new int[sizeOfArray];
        for (int i =0;i<arr.length;i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }
    public void insert(int location, int valuetobeInserted){
        try{
            if(arr[location]==Integer.MIN_VALUE){
                arr[location]=valuetobeInserted;
                System.out.println("Successfully Inserted!!");

            }
            else {
                System.out.println("The cell is already Occupied");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){

            System.out.println("Out of Index Range");
        }


    }
    public static void main(String[] args) {
        InsertionArray isA=new InsertionArray(10);
        isA.insert(0,1);
        isA.insert(1,34);
        isA.insert(1,30);
        isA.insert(11,12);

    }
}
