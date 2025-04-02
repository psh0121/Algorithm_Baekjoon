import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String num = sc.next();
			if(num.equals("0")) break;
			String result = num + " ";

			while (num.length() > 1) {
				int gop = 1;
				for(int i = 0; i < num.length(); i++) {
					gop *= Character.getNumericValue(num.charAt(i));
				}

				result += gop + " ";
				num = Integer.toString(gop);
			}
			System.out.println(result.trim());
		}
		sc.close();
    }
}
