import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.printf("Enter the digit Number");
       int n=sc.nextInt();
       sc.close();
       int i=n,sum=0,o=n;
       while(n>0){
        i=n%10;
        n=n/10;
        sum+=i*i*i;
       }
       if (sum==o){System.out.println("Armstrong");}
       else{System.out.println("Not");}
    }
}
