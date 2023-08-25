import java.util.Scanner; 
public class Methods {
    double area_of_circle(double a){
        return (22*a*a/7);
    }
    void area_of_rect(int a,int b){
        System.out.println(a*b +" is the area of RECTANGLE"); 
    }
    public static void main(String[] args) {
        Methods t=new Methods();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the radius- ");
        double r = sc.nextDouble();
        System.out.println(t.area_of_circle(r));
        System.out.printf("Enter the Dimensions of rect- \n");
        int a=sc.nextInt(),b=sc.nextInt();
        sc.close();
        t.area_of_rect(a,b);
    }
}