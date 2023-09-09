import java.util.Scanner;
public class Loop11 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt(),w=0;
        sc.close();
        System.out.println(n%10+" is the last digit");
        while(n>0){
            w=n;
            n/=10;
        }
        System.out.println(w+" is the first didgit");
    }
}
// UTKARSH SHARMA--68