import java.util.Scanner;

public class String12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(),s1="";
        sc.close();
        for (int i = s.length()-1; i >= 0; --i)
            s1=s1+s.charAt(i);
        if (s1.equals(s))
            System.out.println("Palindrome");
        else
            System.out.println("No");
    }
}
// UTKARSH SHARMA--68