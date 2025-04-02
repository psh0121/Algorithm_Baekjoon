import java.util.Scanner;

public class Main {
	public static boolean isNum(String value) {
		boolean numFlag = true;

		for(int i = 0; i < value.length(); i++) {
			int asciValue = (int)value.charAt(i);

			if (asciValue >= 48 && asciValue <= 57) {
				continue;
			}
			else {
				numFlag = false;
				break;
			}
		}

		return numFlag;
	}
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		String y = sc.next();

		if(isNum(x) && isNum(y)) {
			System.out.println(Integer.parseInt(x) - Integer.parseInt(y));
		}
		else System.out.println("NaN");

		sc.close();
    }
}