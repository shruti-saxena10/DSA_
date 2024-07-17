package com.array.theory;

public class DeleteArrayElement {
    public int deleteElement(int[] arr4,int location) {
        arr4[location]=Integer.MIN_VALUE;
        return arr4[location];
    }

    public static void main(String[] args) {
        int[] arr4=new int[5];
        arr4=new int[]{1,23,45,6,789};
        int location=3;
        DeleteArrayElement at=new DeleteArrayElement();
        var res=at.deleteElement(arr4,3);
        System.out.println(res);
    }
}
