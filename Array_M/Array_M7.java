import java.util.Scanner;

public class Array_M7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Elements :-");
        int n=sc.nextInt(),a[]=new int[n],Neg=0;
        System.out.println("Enter the elements:-");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.printf("Negative Elements= ");
        for (int i = 0; i < n; i++) {
            if (a[i]<0) ++Neg;
        }
        System.out.println(Neg);
    }
}
// UTKARSH SHARMA--68