import java.util.Scanner;
public class Vow1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a=sc.next().charAt(0);
        sc.close();
        switch (a) {
            case 'a', 'e', 'i', 'o', 'u':
                System.out.println("Vowels");
                break;
        
            default:
                System.out.println("No");
                break;
        }
    }
}