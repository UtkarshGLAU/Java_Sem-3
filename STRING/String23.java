import java.util.Scanner;

public class String23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(),s1="";
        System.out.println("Enter the character");
        char c=sc.next().charAt(0);
        sc.close();
        for (int i = 0; i < s.length(); i++) {
            if(c==s.charAt(i)){
                continue;
            }
            s1=s1+s.charAt(i);
        }
        s=s1;
        System.out.println(s);
    }
}
// UTKARSH SHARMA--68