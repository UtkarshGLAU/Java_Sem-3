import java.util.Scanner;

public class Array_M4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Elements :-");
        int n=sc.nextInt(),a[]=new int[n],min=0,max=0;
        System.out.println("Enter the elements:-");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        min=max=a[0];
        sc.close();
        for (int i = 0; i < n; i++) {
            if (min>a[i]) min=a[i];
            if (max<a[i]) max=a[i];
        }
        System.out.println("Minimun and Maximum is "+min+" And "+max);
    }
}
// UTKARSH SHARMA--68