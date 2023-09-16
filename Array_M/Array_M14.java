import java.util.Scanner;

public class Array_M14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Elements :-");
        int n=sc.nextInt(),a[]=new int[n],s[]=new int[n];
        System.out.println("Enter the elements:-");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        sc.close();
        a[0]=s[0];
        int y=0,z=0;
        for (int i = 0; i < n; i++) {
            int x=1;
            for (int j = 0; j < y; j++) {
                if (a[i]==s[j]) {x=0;++z;break;}
            }
            if (x==1){
            s[y]=a[i];
            ++y;
            }
        }
        int k[]=new int[n-z];
        for (int i = 0; i < k.length; i++) {
            k[i]=s[i];
        }
        for (int i = 0; i < k.length; i++) {
            System.out.printf("%d ",k[i]);
        }
    }
}
// UTKARSH SHARMA--68