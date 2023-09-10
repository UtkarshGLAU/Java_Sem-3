import java.util.Scanner;

public class Switch5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt(),p=0;
        sc.close();
        if (a%2==0) p=1;
        switch (p) {
            case 1:
                System.out.println("EVEN");
                break;
        
            default:
                System.out.println("ODD");
                break;
        }
    }
}
// UTKARSH SHARMA--68