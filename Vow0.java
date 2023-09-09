import java.util.Scanner;
public class Vow0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if (a =='a'||a == 'e'||a =='i'||a =='o'||a == 'u'||a =='A'||a == 'E'||a =='I'||a =='O'||a == 'U') System.out.println("Yes");
        else System.out.println("No");
        sc.close();
    }
}
