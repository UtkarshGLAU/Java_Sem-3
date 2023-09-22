import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine(),s2=sc.nextLine();
        sc.close();
        int n=s1.compareTo(s2);
        if(n == 0)
        System.out.println("Both strings are equal.");
        else if(n < 0)
        System.out.println("First string is smaller than second.");
        else
        System.out.println("First string is greater than second.");
    }
}
// UTKARSH SHARMA--68