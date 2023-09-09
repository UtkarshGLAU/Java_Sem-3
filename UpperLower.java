import java.util.Scanner;
public class UpperLower {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    char a =sc.next().charAt(0);
    sc.close();
    if ((a>='a')&&(a<='z')) System.out.println("Lowercase");
    else System.out.println("Uppercase");
}
}
