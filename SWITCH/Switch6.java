import java.util.Scanner;

public class Switch6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt(),p=-1;
        sc.close();
        if (a>0) p=1;
        else if (a==0) p=0;
        switch (p) {
            case 1:
                System.out.println("POSITIVE");
                break;
            case 0:
                System.out.println("ZERO");
                break;
            default:
                System.out.println("NEGATIVE");
                break;
        }
    }
}
// UTKARSH SHARMA--68