import java.util.Scanner;

public class String18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        char r='0';
        int nc=0;
        for (int j = 0; j < s.length(); j++) {
            char c=s.charAt(j);
            int count=0;
            for (int i = 0; i < s.length(); i++) {
                if(c==s.charAt(i)){
                    ++count;
                }
            }
            if (count>nc){
                nc=count;
                r=s.charAt(j);
            }
        }
        System.out.println(r);
    }
}
// UTKARSH SHARMA--68