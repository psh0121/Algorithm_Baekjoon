import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String uos = "UOS";
		int x = sc.nextInt();
		x %= 3;

		System.out.println(x == 0 ? uos.charAt(2) : uos.charAt(x-1));
		sc.close();
    }
}
