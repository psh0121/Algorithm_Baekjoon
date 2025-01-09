import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        char c = sc.next().charAt(0);
        
        // 1. a = c
        if(a == c) System.out.println(""+a+b+c);

        // 2. a != c && b = c
        else if(a != c && b == c) System.out.println(""+a+b+c+a);

        // 3. a != b != c
        else System.out.println(""+a+b+c+b+a);
        sc.close();
    }
}