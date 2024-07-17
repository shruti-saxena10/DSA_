package com.array.theory;

import java.util.Scanner;

public class Project {
    public void average(){
        double sum=0;
        System.out.println("How many day's temperature? ");
        Scanner in =new Scanner(System.in);
        int numOfdays=in.nextInt();
        int[] temp= new int[numOfdays];
        for(int i=0;i<numOfdays;i++){
            System.out.println("Day "+(i+1)+"'s"+"high temp: ");
            temp[i]=in.nextInt();
            sum+=temp[i];

        }
        double average=sum/numOfdays;
        System.out.println("Average = "+average);
        int count=0;
        for (int i=0;i<temp.length;i++){
            if(temp[i]>average){
                count+=1;;
            }
            System.out.println(count+" day(s) above average");
        }


    }


    public static void main(String[] args) {
        Project p=new Project();
        p.average();


    }
}
