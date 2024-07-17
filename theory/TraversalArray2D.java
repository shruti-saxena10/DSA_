package com.array.theory;

public class TraversalArray2D {

    public void traversal2D(int[][] arrtraversal2D){
        for(int i=0;i<arrtraversal2D.length;i++){
            for(int j=0;j<arrtraversal2D[0].length;j++){
                System.out.print(arrtraversal2D[i][j]+ " ");
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        int[][] arrtraversal2D={{1,2,3},{2,1,45},{11,22,99}};
        TraversalArray2D ta2D=new TraversalArray2D();
        ta2D.traversal2D(arrtraversal2D);

    }
}
