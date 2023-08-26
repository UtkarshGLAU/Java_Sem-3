import java.util.Scanner;
public class Fabonaci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter-");
        int n=sc.nextInt();sc.close();
        if (n==1)System.out.println("0");
        else if (n==2) System.out.println("0\n1");
        else{
            System.out.printf("0\n1\n");
            int a=0,b=1,c;
            for(int i=2;i<n;++i){
                c=a+b;
                System.out.println(c);
                a=b;
                b=c;
            }
        }
    }
}

//UTKARSH SHARMA   68