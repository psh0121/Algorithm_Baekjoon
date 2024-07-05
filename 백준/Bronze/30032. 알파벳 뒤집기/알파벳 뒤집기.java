import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();

		for(int i = 0; i < n; i++) {
			String str = sc.next();
			String result = "";

			for(int j = 0; j < str.length(); j++) {
				char s = str.charAt(j);

				if(d == 1) {
					if(s == 'd') result += 'q';
					else if(s == 'b') result += 'p';
					else if(s == 'p') result += 'b';
					else result += 'd';
				}
				else {
					if(s == 'd') result += 'b';
					else if(s == 'b') result += 'd';
					else if(s == 'p') result += 'q';
					else result += 'p';
				}
			}

			System.out.println(result);
		}
		
		sc.close();
    }
}