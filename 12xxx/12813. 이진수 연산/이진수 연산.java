import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();

		StringBuilder andAB = new StringBuilder();
		StringBuilder orAB = new StringBuilder();
		StringBuilder xorAB = new StringBuilder();
		StringBuilder notA = new StringBuilder();
		StringBuilder notB = new StringBuilder();

		for(int i = 0; i < a.length(); i++) {
			char letterA = a.charAt(i);
			char letterB = b.charAt(i);

			// AND
            andAB.append((letterA == '1' && letterB == '1') ? '1' : '0');

            // OR
            orAB.append((letterA == '1' || letterB == '1') ? '1' : '0');

            // XOR
            xorAB.append((letterA != letterB) ? '1' : '0');

            // NOT
            notA.append((letterA == '1') ? '0' : '1');
            notB.append((letterB == '1') ? '0' : '1');
		}


		System.out.println(andAB);
		System.out.println(orAB);
		System.out.println(xorAB);
		System.out.println(notA);
		System.out.println(notB);
		sc.close();
    }
}
