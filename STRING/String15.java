import java.util.Scanner;

public class String15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Enter the character");
        char c=sc.next().charAt(0);
        sc.close();
        int n=0;
        for (int i = 0; i < s.length(); i++) {
            if(c==s.charAt(i)){
                n=i;
            }
        }
        System.out.println(n);
    }
}
// UTKARSH SHARMA--68