import java.util.Scanner;
public class Loop26 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(),j=1;
        sc.close();
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                j = 0;
                break;
            }
        }
        if (j==1) System.out.println("Prime");
        else System.out.println("Composite");
    }
}
// UTKARSH SHARMA--68