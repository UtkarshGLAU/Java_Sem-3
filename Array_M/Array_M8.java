import java.util.Scanner;

public class Array_M8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Elements :-");
        int n=sc.nextInt(),a[]=new int[n];
        System.out.println("Enter the elements:-");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Original Array :-");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ",a[i]);
        }  
        int Second_a[]=a;
        System.out.println("");
        System.out.println("Copied array:-");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ",Second_a[i]);
        }
    }
}
// UTKARSH SHARMA--68