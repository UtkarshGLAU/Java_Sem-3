import java.util.Scanner;

public class Loop27 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(),k=1;
        sc.close();
        for(int j=2;j<n;++j){
            for(int i=2; i<=j/2; i++){
                if(j%i==0){
                    k = 0;
                    break;
                }
            }
            if (k==1) System.out.printf("%d ",j);
            k=1;   
        }
    }
}
// UTKARSH SHARMA--68