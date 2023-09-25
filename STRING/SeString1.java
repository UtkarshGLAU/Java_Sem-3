import java.util.Scanner;

public class SeString1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '!', ',' ,'\'' ,';' ,'\"', '.', '-' ,'?':
                    count++;
                    break;
                default:
                    break;
            }
        }
        System.out.println(count);
    }
}
// UTKARSH SHARMA--68