import java.util.Scanner;

public class String13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(),r="";
        sc.close();
        String a[]=s.split(" ");
        for (int i = a.length-1; i >= 0; i--) {
            r=r+a[i]+" ";
        }
        System.out.println(r);
    }
}
// UTKARSH SHARMA--68