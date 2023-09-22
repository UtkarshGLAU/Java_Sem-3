import java.util.Scanner;

public class String7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        int l=s.length();
        String t="";
        for (int i = 0; i < l; i++) {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
                t=t+(char)(s.charAt(i)-32);
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
                t=t+(char)(s.charAt(i)+32);
            else                 
                t=t+s.charAt(i);
        }
        System.out.println(t);
    }
}
// UTKARSH SHARMA--68