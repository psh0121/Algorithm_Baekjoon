import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String[] strArr = new String[t];
		String[] codeArr = new String[t];
		for(int i = 0; i < t; i++) {
			strArr[i] = sc.next();
			codeArr[i] = sc.next();
		}

		String str = sc.next();
		String result = "";

		for(int i = 0; i <= str.length() - 4; i+=4) {
			String value = str.substring(i, i+4);

			String inputStr = "?";

			for(int j = 0; j < codeArr.length; j++) {
				if(codeArr[j].equals(value)) {
					inputStr = strArr[j];
					break;
				}
			}

			result += inputStr;
		}

		System.out.println(result);
        sc.close();
    }
}
