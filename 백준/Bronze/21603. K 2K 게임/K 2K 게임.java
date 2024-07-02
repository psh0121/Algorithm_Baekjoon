import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String k = sc.next();

		int numK = Integer.parseInt(String.valueOf(k.charAt(k.length() - 1)));

		int cnt = 0;
		String result = "";

		for(int i = 1; i <= n; i++) {
			String strI = Integer.toString(i);
			int oneI = Integer.parseInt(String.valueOf(strI.charAt(strI.length() - 1)));

			if(oneI != numK && oneI != 2 * numK) {
				cnt++;
				result += i + " ";
			}
		}

		System.out.println(cnt);
		System.out.println(result);
		
		sc.close();
    }
}