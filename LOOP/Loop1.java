import java.util.Scanner; 
public class Loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),i=0;
        sc.close();
        while(i<n){
            System.out.println(i+1);
            ++i;
        }

    }
}

// UTKARSH SHARMA--68