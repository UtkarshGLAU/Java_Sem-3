import java.util.Scanner;
public class Loop22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;++i){
            if (n%i==0)
            System.out.printf("%d ",i);
        }
    }
}
// UTKARSH SHARMA--68