import java.util.*;

public class Student {
    String name;
    String classs;
    int roll_no;
    String email_id;
    float marks;
    long contact_no;

    void get(){
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter your Name- ");
        name=sc.nextLine();
        System.out.printf("Enter your Class- ");
        classs=sc.next();
        System.out.printf("Enter your Roll No.- ");
        roll_no=sc.nextInt();
        System.out.printf("Enter your Email ID- ");
        email_id=sc.next();
        System.out.printf("Enter your Marks(out of 100)- ");
        marks=sc.nextFloat();
        System.out.printf("Enter your Conatact No.- ");
        contact_no=sc.nextLong();
        sc.close();
    }
    void display(){
        System.out.println(name);
        System.out.println(classs);
        System.out.println(roll_no);
        System.out.println(email_id);
        System.out.println(marks);
        System.out.println(contact_no);
    }
    void result(){
        System.out.println("RESULT="+marks+"%");
    }
    public static void main(String[] args) {
        Student a=new Student();
        a.get();
        a.display();
        a.result();
    }
}


//Utkarsh Sharma   68