import java.util.Scanner;

public class String24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        int in=0;
        char []c=new char[s.length()];
        for (int i = 0; i < c.length; i++) {
            int x=1;
            for (int j = 0; j < c.length; j++) {
                if(c[j]==s.charAt(i)){
                    x=0;
                }
            }
            if (x==1){
                c[in]=s.charAt(i);
                ++in;
            }
        }
        s="";
        for (int i = 0; i < c.length; i++) {
            s=s+c[i];
        }
        System.out.println(s);
    }
}
// UTKARSH SHARMA--68