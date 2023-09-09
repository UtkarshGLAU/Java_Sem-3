import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("No. of elements in array = ");
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter all the elements:-");
        for(int i=0;i<n;++i){
        a[i] = sc.nextInt();}
        sc.close();
        for(int i=0;i<n;++i)
        System.out.println(a[i]);
    }
}

