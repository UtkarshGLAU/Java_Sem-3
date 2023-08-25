import java.util.Scanner;
public class Fabonacci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter-");
        int n=sc.nextInt();sc.close();
        System.out.printf("0\n1");
        int a=0,b=1,c;
        for(int i=2;i<n;++i){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}