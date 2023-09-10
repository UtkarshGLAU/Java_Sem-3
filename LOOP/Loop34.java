import java.util.Scanner;

public class Loop34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),s=0,o=n,x;
        sc.close();
        while (n>0){
            x=1;
            for (int i = 0; i < n%10; i++) {
                x*=n%10-i;
            }
            s+=x;
            n/=10;
        }
        if (s==o) System.out.println("Strong Number");
        else System.out.println("No");
    }
}
// UTKARSH SHARMA--68