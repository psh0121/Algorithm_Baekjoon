import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			String numPow2Str = Integer.toString(num * num);
			String numStr = Integer.toString(num);

			String subStrPow = numPow2Str.substring(numPow2Str.length() - numStr.length());

			if(numStr.equals(subStrPow)) System.out.println("YES");
			else System.out.println("NO");
		}

		sc.close();
    }
}
