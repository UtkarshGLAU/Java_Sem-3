import java.util.Scanner;

public class Array_M9 {
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
        System.out.println("Enter the element to be inserted ");
        int Upd1=sc.nextInt();
        System.out.println("Enter the index ");
        int ind=sc.nextInt();
        sc.close();
        a[ind]=Upd1;
        System.out.println("Updated Array :-");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ",a[i]);
        }
    }
}
// UTKARSH SHARMA--68