import java.util.Scanner;
public class Loop16 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt(),w=n,c=0;
        sc.close();
        while(n>0){
            n/=10;
            ++c;
        }
        for(int i=c-1;i>=0;--i){
            System.out.printf("%d",w%10);
            w/=10;
        }
        
    }
}
// UTKARSH SHARMA--68