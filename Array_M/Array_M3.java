import java.util.Scanner;

public class Array_M3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Elements :-");
        int n=sc.nextInt(),a[]=new int[n],sum=0;
        System.out.println("Enter the elements:-");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        sc.close();
        System.out.println("Sum is "+sum);
    }
}
// UTKARSH SHARMA--68