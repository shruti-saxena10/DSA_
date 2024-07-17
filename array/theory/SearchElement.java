package com.array.theory;

public class SearchElement {

    public int SearchIndex(int[] arr2,int element){
        for(int i=0;i<arr2.length;i++){
            if (arr2[i]==element){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr3=new int[6];
        arr3= new int[]{23, 45, 56, 78, 9, 98, 55};
        int element=9;
        SearchElement se=new SearchElement();
        var result=se.SearchIndex(arr3,element);
        System.out.println(result);

    }
}
