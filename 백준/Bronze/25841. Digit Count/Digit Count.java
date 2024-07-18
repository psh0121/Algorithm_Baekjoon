import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		String num = sc.next();

		int cnt = 0;

		for(int i = start; i <= end; i++) {
			String value = Integer.toString(i);

			for(int j = 0; j < value.length(); j++) {
				if(value.charAt(j) == num.charAt(0)) cnt++;
			}
		}

		System.out.println(cnt);
		
		sc.close();
    }
}
