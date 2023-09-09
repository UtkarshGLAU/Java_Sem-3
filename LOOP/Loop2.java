import java.util.Scanner; 
public class Loop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        while(n>0){
            System.out.println(n);
            --n;
        }

    }
}
// UTKARSH SHARMA--68