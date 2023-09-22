import java.util.Scanner;

public class String20 {
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
        for (int i = 0; i < c.length; i++) {
            int count=0;
            for (int j = 0; j < c.length; j++) {
                if(c[i]==s.charAt(j))
                    count++;
            }
            if(count==0) continue;
            System.out.println(c[i]+" = "+count);
        }
    }
}
// UTKARSH SHARMA--68