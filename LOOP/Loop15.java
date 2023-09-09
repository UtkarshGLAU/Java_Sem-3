import java.util.Scanner;
public class Loop15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),count=1;
        sc.close();
        while(n>0){
            count=count*(n%10);
            n/=10;
        }
        System.out.println(count);
    }
}
// UTKARSH SHARMA--68