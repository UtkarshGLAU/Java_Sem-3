import java.util.Scanner;
public class Loop30 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(),c=0,o=n,sum=0,x=1;
        sc.close();
        while(n>0){
            n/=10;
            ++c;
        }
        n=o;
        while(n>0){
            for (int i = 0; i < c; ++i) {
                x*=n%10;
            }
            sum+=x;
            x=1;
            n/=10;
        }
        if (sum==o) System.out.println("ARMSTRONG");
    }
}
// UTKARSH SHARMA--68