import java.util.*;
public class Loop8{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int i=1;
        int sum=0;
      
        while(i<=n){
            if(i%2!=0){

                sum=sum+i;
            }
            
            i++;
            
        }
        System.out.println(sum);
    }
}
// UTKARSH SHARMA--68