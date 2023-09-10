import java.util.Scanner;
public class Loop31 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int e=sc.nextInt(),c,sum,x,n;
        sc.close();
        for (int j = 0; j <= e; j++) {
            n=j;
            c=0;
            sum=0;
            x=1;
            while(n>0){
                n/=10;
                ++c;
            }
            n=j;
            while(n>0){
                for (int i = 0; i < c; ++i) {
                    x*=n%10;
                }
                sum+=x;
                n/=10;
                x=1;
            }
            if (sum==j) System.out.printf("%d ",j);
        }
    }
}
// UTKARSH SHARMA--68