import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();

		String a = "";
		String b = "";
		String c = "";

		for(int i = 0; i < n; i++) {
			char letter = str.charAt(i);

			if(letter == 's') {
				if(a.length() < k) a += letter;
				else if(b.length() < k) b += letter;
				else c += letter;
			}
			else if (letter == 'r') {
				if(b.length() < k) b += letter;
				else if(c.length() < k) c += letter;
				else a += letter;
			}
			else {
				if(c.length() < k) c += letter;
				else if(a.length() < k) a += letter;
				else b += letter;
			}
		}

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		sc.close();
    }
}
