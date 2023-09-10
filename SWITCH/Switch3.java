import java.util.Scanner;
public class Switch3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a=sc.next().charAt(0);
        sc.close();
        switch (a) {
            case 'a', 'e', 'i', 'o', 'u','A','E','I','O','U':
                System.out.println("Vowel");
                break;
        
            default:
                System.out.println("No");
                break;
        }
    }
}
// UTKARSH SHARMA--68