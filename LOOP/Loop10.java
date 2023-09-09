import java.util.Scanner;
public class Loop10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),count=0;
        sc.close();
        while(n>0){
            n/=10;
            ++count;
        }
        System.out.println(count);
    }
}
// UTKARSH SHARMA--68