import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			String str = sc.next();
			int a = 0;
			int b = 0;

			for(int j = 0; j < str.length(); j++) {
				char value = str.charAt(j);
				if(value == 'a') a++;
				else b++;
			}

			System.out.println(Math.min(a, b));
		}
        sc.close();
    }
}
