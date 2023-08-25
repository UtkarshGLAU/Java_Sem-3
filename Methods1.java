import java.util.*;
public class Methods1 {
    static int fact(int n){
        if (n>1){return n*fact((n-1));}
        else {return n;}
    }
    static int Max(int a,int b){
        return a>b?a:b;  
    }
    public static void main(String[] args) {
        System.out.printf("Enter (fact) no.- ");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(fact(n));
        System.out.println("Enter the no.s- ");
        int a=sc.nextInt(),b=sc.nextInt();
        sc.close();
        System.out.println(Max(a,b));
    }
}