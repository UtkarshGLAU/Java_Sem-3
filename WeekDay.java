import java.util.Scanner;
public class WeekDay {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int dayOfWeek = sc.nextInt();
       sc.close();
       if (dayOfWeek == 0) {
        System.out.println("Sunday");
      }
      else if (dayOfWeek == 1) {
        System.out.println("Monday");
      }
      else if (dayOfWeek == 2) {
        System.out.println("Tuesday");
      }
      else if (dayOfWeek == 3) {
        System.out.println("Wedneday");
      }
      else if (dayOfWeek == 4) {
        System.out.println("Thurday");
      }
      else if (dayOfWeek == 5) {
        System.out.println("Friday");
      }
      else
        System.out.println("Sarurday");
    }

}