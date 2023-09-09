import java.util.Scanner;
public class NoDayMonth1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        switch (n) {
            case 2:
                System.out.println("28");
                break;
            case 1,3,5,7,8,10,12:
                System.out.println("31");
                break;
        
            default:
                System.out.println("30");
                break;
        }
    }
}
