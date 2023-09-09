import java.util.Scanner;
public class Loop19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int o=sc.nextInt(),n=0;
        sc.close();
        while(o != 0)
    {
        n = (n * 10) + (o% 10);
        o /= 10;
    }
        while(n!= 0)
    {
        switch(n % 10)
        {
            case 0: 
                System.out.printf("Zero ");
                break;
            case 1: 
                System.out.printf("One ");
                break;
            case 2: 
                System.out.printf("Two ");
                break;
            case 3: 
                System.out.printf("Three ");
                break;
            case 4: 
                System.out.printf("Four ");
                break;
            case 5: 
                System.out.printf("Five ");
                break;
            case 6: 
                System.out.printf("Six ");
                break;
            case 7: 
                System.out.printf("Seven ");
                break;
            case 8: 
                System.out.printf("Eight ");
                break;
            case 9: 
                System.out.printf("Nine ");
                break;
        }
        
        n = n / 10;
    }
    }
}

// UTKARSH SHARMA--68