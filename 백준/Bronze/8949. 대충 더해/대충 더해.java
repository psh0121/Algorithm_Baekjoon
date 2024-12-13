import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();

		if(a.length() > b.length()) {
			b = "0".repeat(a.length() - b.length()) + b;
		}
		else {
			a = "0".repeat(b.length() - a.length()) + a;
		}
		
		String result = "";

		for(int i = 0; i < a.length(); i++) {
			int aNum = Integer.parseInt(Character.toString(a.charAt(i)));
			int bNum = Integer.parseInt(Character.toString(b.charAt(i)));

			result += (aNum + bNum);
		}

		System.out.println(result);
		sc.close();
    }
}
