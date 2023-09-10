import java.util.Scanner;

public class Loop29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),k=1;
        sc.close();
        for(int i=2;i<=n;++i){
            if (n%i==0){
                for(int j=2; j<=i/2; j++){
                    if(i%j==0){
                        k = 0;
                        break;
                    }
                }
                if (k==1) System.out.printf("%d ",i);
                k=1;
            }
        }
    }
}
// UTKARSH SHARMA--68