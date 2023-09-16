import java.util.Scanner;

public class Array_M11 {
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
        for (int i = 0; i < n; i++) {
            int x=1,f=0;
            for (int j = 0; j < s.length; j++) {
                if (a[i]==s[j]) {x=0; break;}
            }
            if (x==1){
                for (int j = 0; j < n; j++) {
                    if (a[i]==a[j]) ++f;
                }
                s[y]=a[i];
                ++y;
                System.out.println("Frequncy of "+a[i]+" is "+f);
            }
        }
    }
}
// UTKARSH SHARMA--68