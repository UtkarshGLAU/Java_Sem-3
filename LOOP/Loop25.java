import java.util.Scanner;

public class Loop25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),q,v=1;
        sc.close();
        q=n<m?n:m;
        while(q>0){
            if (n%q==0 && m%q==0){
                v=q;
                break;
            }
            --q;
        }
        System.out.println(n*m/v);
    }
}
