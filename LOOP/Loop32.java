import java.util.Scanner;

public class Loop32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),s=0;
        sc.close();
        for(int i=1;i<n;++i){
            if (n%i==0)
            s+=i;
        }
        if (s==n)
        System.out.println("PERFECT NUMBER");
        else 
        System.out.println("No");
    }
}
// UTKARSH SHARMA--68