package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //method_1
        /*
        System.out.print("    *\n");
        System.out.print("   ***\n");
        System.out.print("  *****\n");
        System.out.print(" *******\n");
        System.out.print("*********\n");*/

        //method_2
        /*
        for(int i=1;i<6;i++){
            for(int j=5-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }*/

        //n rows
        int n,i,j,k;
        Scanner input=new Scanner(System.in);
        System.out.print("Please input rows of glod triangle:");
        n=input.nextInt();
        for (i=1;i<=n;i++){
            for (j=n-i;j>=0;j--){
                System.out.print(" ");
            }
            for (k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
