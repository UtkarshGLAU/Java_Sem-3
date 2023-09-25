import java.io.*;
import java.util.Scanner;
public class Temp1{
public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);
            int n=scanner.nextInt();
            String junk=scanner.next();
            String s = scanner.nextLine().toLowerCase();
            char c[]={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            int k=1;
            for (int i = 0; i < c.length; i++) {
                int l=1;
                for (int j = 0; j < s.length(); j++) {
                    if(s.charAt(j)==c[i]){
                        l=0;
                        break;
                    }
                }
                if(l!=0){k=0;break;}

            }
            
            if (k==1) {
                System.out.println("YES");
            } 
            else {
                System.out.println("NO");
            }
        }
}
