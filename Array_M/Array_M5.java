import java.util.Scanner;

public class Array_M5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Elements :-");
        int n=sc.nextInt(),a[]=new int[n],max=0,Second_max=0;
        System.out.println("Enter the elements:-");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            if (max<a[i]){
                Second_max=max;
                max=a[i];
            }
        }
        sc.close();
        System.out.println("Second Largest element is "+ Second_max);
    }
}
