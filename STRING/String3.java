import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine(),s2=sc.nextLine();
        sc.close();
        String s12=s1.concat(s2);
        System.out.println(s12);
    }
}
// UTKARSH SHARMA--68