import java.util.Scanner;
public class InputSc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte a=sc.nextByte();
        short b=sc.nextShort();
        int c=sc.nextInt();
        long d=sc.nextLong();
        float e=sc.nextFloat();
        double f=sc.nextDouble();
        boolean g=sc.nextBoolean();
        String h=sc.next();
        String i=sc.nextLine();
        sc.close();
        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i);
    }
}

//UTKARSH SHARMA   68