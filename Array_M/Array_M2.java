import java.util.Scanner;

public class Array_M2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Elements :-");
        int n=sc.nextInt(),a[]=new int[n];
        System.out.println("Enter the elements:-");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Negative Elements:-");
        for (int i = 0; i < n; i++) {
            if (a[i]<0) System.out.println(a[i]);
        }
    }
}
// UTKARSH SHARMA--68