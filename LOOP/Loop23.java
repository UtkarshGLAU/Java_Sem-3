import java.util.Scanner;
public class Loop23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),v=1;
        sc.close();
        while(n>0){
            v*=n;
            --n;
        }
        System.out.println(v);
    }
}
// UTKARSH SHARMA--68