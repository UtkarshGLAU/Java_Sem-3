import java.util.Scanner;

public class String16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Enter the character");
        char c=sc.next().charAt(0);
        sc.close();
        for (int i = 0; i < s.length(); i++) {
            if(c==s.charAt(i)){
                System.out.print(i+" ");
            }
        }
    }
}
// UTKARSH SHARMA--68