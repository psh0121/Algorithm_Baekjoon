import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String reverseStr = new StringBuilder(str).reverse().toString();

        System.out.println(str.equals(reverseStr) ? "beep" : "boop");
        sc.close();
    }
}
