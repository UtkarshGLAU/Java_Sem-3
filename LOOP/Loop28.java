import java.util.Scanner;

public class Loop28 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(),k=1,sum=0;
        sc.close();
        for(int j=2;j<n;++j){
            for(int i=2; i<=j/2; i++){
                if(j%i==0){
                    k = 0;
                    break;
                }
            }
            if (k==1) sum+=j;
            k=1;   
        }
        System.out.println(sum);
    }
}
// UTKARSH SHARMA--68