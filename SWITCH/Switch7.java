import java.util.Scanner;

public class Switch7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt(),r=0;
        char op=sc.next().charAt(0);
        int b=sc.nextInt();
        sc.close();
        switch(op){
            case '+': 
                r = a + b;
                break;
            case '-': 
                r = a - b;
                break;
            case '*': 
                r = a * b;
                break;
            case '/': 
                r = a / b;
                break;
            case '%':
                r = a % b;
                break;
            default: 
                break;
        }
        System.out.println(r);
    }
}
// UTKARSH SHARMA--68