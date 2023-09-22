import java.util.Scanner;

public class String8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        int c=0,n=0,sp=0;
        for (int i = 0; i < s.length(); i++) {
            if((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='A' && s.charAt(i)<='Z'))
                ++c;
            else if(s.charAt(i)>='0' && s.charAt(i)<='9')
                ++n;
            else
                ++sp;
        }
        System.out.println("Alhabets="+c+"\nDigits="+n+"\nSpecial Cahracter="+sp);
    }
}
// UTKARSH SHARMA--68