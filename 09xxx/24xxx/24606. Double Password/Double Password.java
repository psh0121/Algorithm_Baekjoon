import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] pw1 = sc.next().split("");
		String[] pw2 = sc.next().split("");

		int p0 = pw1[0].equals(pw2[0]) ? 1 : 2;
		int p1 = pw1[1].equals(pw2[1]) ? 1 : 2;
		int p2 = pw1[2].equals(pw2[2]) ? 1 : 2;
		int p3 = pw1[3].equals(pw2[3]) ? 1 : 2;

		System.out.println(p0 * p1 * p2 * p3);
		sc.close(); 
    }
}
