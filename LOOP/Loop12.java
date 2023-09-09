import java.util.Scanner;
public class Loop12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt(),w=0,v=n%10;
        sc.close();
        while(n>0){
            w=n;
            n/=10;
        }
        System.out.println(w+v+" is the sum of first and last digits");
    }
}
// UTKARSH SHARMA--68