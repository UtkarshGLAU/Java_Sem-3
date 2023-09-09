import java.util.Scanner;
public class Loop13 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt(),w=n,c=0;
        sc.close();
        while(n>0){
            n/=10;
            ++c;
        }
        int a[]=new int[c];
        for(int i=c-1;i>=0;--i){
            a[i]=w%10;
            w/=10;
        }
        c -=1;
        System.out.printf("%d",a[c]);
        for(int i=1;i<c;i++){
            System.out.printf("%d",a[i]);
        }
        System.out.printf("%d",a[0]);
    }
}
// UTKARSH SHARMA--68