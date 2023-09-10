import java.util.Scanner;

public class Loop33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j=sc.nextInt(),s=0;
        sc.close();
        for (int n = 1; n <= j; n++) {
            for(int i=1;i<n;++i){
                if (n%i==0)
                s+=i;
            }
            if (s==n)
            System.out.printf("%d ",n);
            s=0;
        }
    }
}
// UTKARSH SHARMA--68