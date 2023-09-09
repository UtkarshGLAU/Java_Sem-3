import java.util.Scanner;
public class Loop21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),p=sc.nextInt(),o=n;
        sc.close();
        while(p>1){
            n*=o;
            --p;
        }
        System.out.println(n);
    }
}
// UTKARSH SHARMA--68