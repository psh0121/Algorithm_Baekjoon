import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    String c = sc.next();

    int cMod2 = Character.getNumericValue(c.charAt(c.length() - 1)) % 2;

    System.out.println(cMod2 == 0 ? a : (a^b));
		sc.close();
    }
}
