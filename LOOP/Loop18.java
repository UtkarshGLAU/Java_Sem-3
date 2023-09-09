import java.util.Scanner;
public class Loop18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),c=0,f=0,w=n;
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
        for(int i=0;i<c;++i){
            for(int j=0;j<c;++j){
                if (a[i]==a[j]) ++f;
            }
            System.out.println(a[i]+" FREQUENCY IS "+f);
            f=0;
        }
    }
}
// UTKARSH SHARMA--68