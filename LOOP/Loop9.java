import java.util.Scanner;
public class Loop9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),w=0;
        sc.close();
        for(int i=1;i<11;++i){
            w=n*i;
            System.out.println(n+"*"+i+"="+w);
        }
    }
}
// UTKARSH SHARMA--68