import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();

		char endA = a.charAt(a.length() - 1);
		char startB = b.charAt(0);
		char endB = b.charAt(b.length() - 1);
		char startC = c.charAt(0);

		String result = a;

		if(endA == startB) {
			result += "'" + b.substring(1, b.length());
		}
		else {
			result += b;
		}

		if(endB == startC) {
			result += "'" + c.substring(1, c.length());
		}
		else {
			result += c;
		}

		System.out.println(result);
		sc.close();
    }
}
