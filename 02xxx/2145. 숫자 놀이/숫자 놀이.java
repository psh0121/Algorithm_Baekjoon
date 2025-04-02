import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		while (true) {
			String num = sc.next();
			if(num.equals("0")) break;

			String result = "";
			while (true) {
				int sum = 0;
				for(int i = 0; i < num.length(); i++) {
					sum += Integer.parseInt(Character.toString(num.charAt(i)));
				}

				result = Integer.toString(sum);

				if(result.length() == 1) break;

				num = result;
			}

			System.out.println(result);
		}
		sc.close();
    }
}
