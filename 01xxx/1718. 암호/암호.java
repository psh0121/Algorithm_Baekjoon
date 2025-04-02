import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String secretKey = sc.nextLine();
		secretKey = secretKey.repeat(str.length() / secretKey.length() + 1);
		int[] secretKeyNum = new int[secretKey.length()];

		for(int i = 0; i < secretKey.length(); i++) {
			secretKeyNum[i] = (int)secretKey.charAt(i) - 96;
		}

		String result = "";

		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				result += " ";
				continue;
			}

			int curNum = (int)str.charAt(i) - 96;
			int value = 0;

			if(curNum - secretKeyNum[i] > 0) value += (curNum - secretKeyNum[i]) + 96;
			else if(curNum - secretKeyNum[i] == 0) value += 122;
			else value += 122+(curNum - secretKeyNum[i]);

			result += (char)value;
		}

		System.out.println(result);
		sc.close();
    }
}
