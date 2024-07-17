package com.array.theory;

public class ArrayTraversal {
    public void ATraversal(int[] arr5){
        for(int i=0;i<arr5.length;i++){
            System.out.println(arr5[i]);
        }
    }

    public static void main(String[] args) {
        ArrayTraversal t=new ArrayTraversal();
        int[] arr5=new int[6];
        arr5= new int[]{1, 2, 344, 55, 67, 88};
        t.ATraversal(arr5);
    }

}
