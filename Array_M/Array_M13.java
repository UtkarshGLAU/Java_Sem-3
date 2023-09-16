import java.util.Scanner;

public class Array_M13 {
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
            int x=0,q=1;
            for (int j = 0; j < s.length; j++){ 
                if(a[i]==s[j]) q=0;
            }
            if(q!=1)continue;
            s[y]=a[i];
            ++y;
            for (int k = 0; k < s.length; k++) {
                if (a[i]==a[k]) {++x;}
            }
            System.out.println(a[i]+" is "+x+" times");   
        }    
    }
}
// UTKARSH SHARMA--68