import java.util.Scanner;
public class If3 {
    public static void main(String...args){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        if (a>0) System.out.println("positive");
        else if (a==0) System.out.println("zero");
        else System.out.println("negative");
        sc.close();
    }
}
// UTKARSH SHARMA--68