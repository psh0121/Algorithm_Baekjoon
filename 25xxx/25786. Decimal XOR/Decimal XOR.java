import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();

		if(a.length() != b.length()) {
			if(a.length() < b.length()) {
				a = "0".repeat(b.length() - a.length()) + a;
			}
			else {
				b = "0".repeat(a.length() - b.length()) + b;
			}
		}

		String[] aArr = a.split("");
		String[] bArr = b.split("");

		String result = "";

		for(int i = 0; i < aArr.length; i++) {
			int numA = Integer.parseInt(aArr[i]);
			int numB = Integer.parseInt(bArr[i]);

			if(numA <= 2 && numB <= 2) result += "0";
			else if(numA >= 7 && numB >= 7) result += "0";
			else result += "9";
		}

		System.out.println(result);

        sc.close();
    }
}
