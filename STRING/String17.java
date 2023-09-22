import java.util.Scanner;

public class String17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Enter the character");
        char c=sc.next().charAt(0);
        sc.close();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(c==s.charAt(i)){
                ++count;
            }
        }
        System.out.println(count);
    }
}
// UTKARSH SHARMA--68