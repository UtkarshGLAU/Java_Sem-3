import java.util.Scanner;
public class Loop17 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt(),w=n,o=n,c=0,q=0,x=1;
        sc.close();
        while(n>0){
            n/=10;
            ++c;
        }
        while(c>0){
            x*=10;
            --c;
        }
        x/=10;
        while(w>0){
            q+=(w%10)*x;
            w/=10;
            x/=10;
        }
        if (o==q) System.out.println("YES!");
        else System.out.println("NO!");
    }
}
// UTKARSH SHARMA--68