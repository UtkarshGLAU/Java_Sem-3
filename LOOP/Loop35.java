import java.util.Scanner;

public class Loop35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j=sc.nextInt(),s,x,n;
        sc.close();
        for (int o = 1; o <= j; o++){
            n=o;
            s=0;
            while (n>0){
                x=1;
                for (int i = 0; i < n%10; i++) {
                    x*=n%10-i;
                }
                s+=x;
                n/=10;
            }
            if (s==o) System.out.printf("%d ",o);
        }
    }
}
// UTKARSH SHARMA--68