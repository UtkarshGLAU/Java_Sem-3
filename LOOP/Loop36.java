import java.util.Scanner;

public class Loop36 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt(),a=0,b=1,c=0;
        sc.close();
        if (n==1) System.out.println(a);
        else if (n==2) System.out.println(a+" "+b);
        else{
            System.out.printf("0 1 ");
            for (int i = 2; i < n; i++) {
                c=a+b;
                System.out.printf("%d ",c);
                a=b;
                b=c;
            }
        }
    }
}
// UTKARSH SHARMA--68