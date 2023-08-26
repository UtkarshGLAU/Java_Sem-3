public class FirstAndLast {
    public static void main(String[] args) {
        int num = 54869,t;
        t=num;
        System.out.println("Original Number is :- \n" + num);
        int remainder = 0;
        while(num != 0) {
            remainder = num % 10;
            num /= 10;
        }
        System.out.print("\nLast Digit is :- \n" + t % 10);
 
        System.out.print("\nFirst Digit is :- \n" + remainder);
    }
}


//UTKARSH SHARMA   68
