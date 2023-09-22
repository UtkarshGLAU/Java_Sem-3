import java.util.Scanner;

public class String9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        int v=0,c=0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u','A','E','I','O','U':
                ++v;
                break;
                
            case  'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z','y','B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L','M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y','Z':
                ++c;
                break;
            default:
                break;
            }
        }
        System.out.println("Vowels="+v+"\nConsonants="+c);
    }
}
// UTKARSH SHARMA--68