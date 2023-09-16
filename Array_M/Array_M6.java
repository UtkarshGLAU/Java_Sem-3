import java.util.Scanner;

public class Array_M6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Elements :-");
        int n=sc.nextInt(),a[]=new int[n],even=0,odd=0;
        System.out.println("Enter the elements:-");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            if (a[i]%2==0) ++even;
            else ++odd;
        }
        sc.close();
        System.out.println("Even number ="+even+" And Odd Number ="+odd);
    }
}
// UTKARSH SHARMA--68