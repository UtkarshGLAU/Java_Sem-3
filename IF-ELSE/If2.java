import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        sc.close();
        if (a>b && a>c) System.out.println(a);
        else if (b>a && b>c)System.out.println(b);
        else System.out.println(c);
    }
}
// UTKARSH SHARMA--68