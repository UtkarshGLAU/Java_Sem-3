import java.util.Scanner;

public class Switch4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),p=0;
        sc.close();
        boolean x=a>b;
        if (x==true)  p=1;
        switch (p) {
            case 1 :
                System.out.println(a);
                break;
        
            default:
                System.out.println(b);
                break;
        }
    }
}
// UTKARSH SHARMA--68