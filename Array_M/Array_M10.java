import java.util.Scanner;

public class Array_M10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Elements :-");
        int n=sc.nextInt(),a[]=new int[n];
        System.out.println("Enter the elements:-");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("Array :-");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ",a[i]);
        }
        System.out.println("");
        System.out.println("Index of element to be deleted ");
        int del=sc.nextInt();
        sc.close();
        for (int i = del; i < n-1; i++) {
            a[i]=a[i+1];
        }
        System.out.println(" Updated Array :-");
        for (int i = 0; i < n-1; i++) {
            System.out.printf("%d ",a[i]);
        }
    }
}
// UTKARSH SHARMA--68