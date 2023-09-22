import java.util.Scanner;

public class String33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(),s1="",s2="";
        System.out.println("Enter the word ");
        String w=sc.next();
        sc.close();
        int last=-1;
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
                last=i;
            }
        }
        for (int i = 0; i < last; i++) {
            s1=s1+a[i]+" ";
        }
        for (int i = last+1; i < a.length; i++) {
            s2=s2+" "+a[i];
        }
        s=s1+s2;
        System.out.println(s);
    }
}
// UTKARSH SHARMA--68