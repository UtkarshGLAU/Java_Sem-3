import java.util.Scanner;

public class String25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(),s1="",s2="";
        System.out.println("Enter the character to be replaced ");
        char c=sc.next().charAt(0);
        System.out.println("Enter the character to it be replaced with ");
        char cr=sc.next().charAt(0);
        sc.close();
        int n=0;
        for (int i = 0; i < s.length(); i++) {
            if(c==s.charAt(i)){
                n=i;
                s1=s1+cr;
                break;
            }
            s1=s1+s.charAt(i);
        }
        for (int i = n+1; i < s.length(); i++) {
            s2=s2+s.charAt(i);
        }
        s=s1+s2;
        System.out.println(s);
    }
}
// UTKARSH SHARMA--68