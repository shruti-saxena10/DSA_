package com.array.theory;

public class SearchElement2D {

    int i,j=0;
    public void Search2D(int[][] arrSearch2D, int target){
        for (i=0;i< arrSearch2D.length;i++){
            for (j=0;j<arrSearch2D[0].length;j++){
                if(arrSearch2D[i][j]==target){
                    System.out.println("Element is at Row "+i+" and Column "+j);
                    return;
                }

            }
        }
        System.out.println("Not found");

    }
    public static void main(String[] args) {
        int[][] arrSearch2D={{12,14},{16,19,20},{1,87}};
        int target=10;
        SearchElement2D se2D=new SearchElement2D();
        se2D.Search2D(arrSearch2D,target);

    }
}
