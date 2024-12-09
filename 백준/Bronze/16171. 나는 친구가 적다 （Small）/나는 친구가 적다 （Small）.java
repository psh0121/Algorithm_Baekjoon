import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String k = sc.next();

		String replaceS = s.replaceAll("[0-9]", "");

		System.out.println(replaceS.contains(k) ? 1 : 0);
		sc.close();
    }
}
