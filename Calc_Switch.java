import java.util.*;
public class Calc_Switch{
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.printf("Enter the first Number-");
        float a=Sc.nextFloat();
        System.out.printf("Enter the second Number-");
        float b=Sc.nextFloat();
        System.out.printf("Enter the Operator-");
        char operator =Sc.next().charAt(0);Sc.close();
        switch(operator){
            case '+':
            System.out.printf("%f %c %f = %f",a,operator,b,a+b);
            break;
            case '-':
            System.out.printf("%f %c %f = %f",a,operator,b,a-b);
            break;
            case '*':
            System.out.printf("%f %c %f = %f",a,operator,b,a*b);
            break;
            case '/':
            System.out.printf("%f %c %f = %f",a,operator,b,a/b);
            break;
            case '%':
            System.out.printf("%f %c %f = %f",a,operator,b,a%b);
            break;
            default:
            System.out.println("ERROR");
        }
    }
}


//UTKARSH SHARMA   68
