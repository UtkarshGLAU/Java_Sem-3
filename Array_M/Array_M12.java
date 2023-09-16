import java.util.Scanner;

public class Array_M12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Elements :-");
        int n=sc.nextInt(),a[]=new int[n],s[]=new int[n];
        System.out.println("Enter the elements:-");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        sc.close();
        int y=0;
        System.out.println("Unique Elements ");
        for (int i = 0; i < n; i++) {
            int x=1;
            for (int j = 0; j < s.length; j++) {
                if (a[i]==s[j]) {x=0; break;}
            }
            if (x==1){
                s[y]=a[i];
                ++y;
                System.out.printf("%d ",a[i]);
            }
        }
    }
}
// UTKARSH SHARMA--68