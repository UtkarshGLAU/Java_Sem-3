import java.util.Scanner;
public class NoDayMonth {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();;
    if (n==2)System.out.println("28");
    else if((n<8&&n%2==0)||(n>7&&n%2!=0)) System.out.println("30");
    else System.out.println("31");
   } 
}