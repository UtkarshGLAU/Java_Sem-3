import java.util.Scanner;

public class String30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Enter the word ");
        String w=sc.next();
        sc.close();
        String a[]=s.split(" ");
        for (int i = 0; i < a.length; i++) {
            int x=1;
            if(a[i].charAt(0)==w.charAt(0)){
                int m=w.length()>a[i].length()?a[i].length():w.length();
                for (int index = 1; index < m; index++) {
                    if (a[i].charAt(index)==w.charAt(index)){
                        x=0;
                        continue;
                    }
                    x=1;
                }
            }
            if (x==0){
                System.out.printf("It is the %d word\n",i+1);
            }
        }
    }
}
// UTKARSH SHARMA--68