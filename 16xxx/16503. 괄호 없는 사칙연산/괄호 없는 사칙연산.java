import java.util.Scanner;

public class Main {

	public static int calVlaue(int n1, int n2, String sign) {
		int result = 0;

		switch (sign) {
			case "+":
				result = n1 + n2;
				break;
			case "-":
				result = n1 - n2;
				break;
			case "*":
				result = n1 * n2;
				break;
			default:
				result = n1 / n2;
				break;
		}

		return result;
	}
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		
		String[] arr = sc.nextLine().split(" ");
		int num1 = Integer.parseInt(arr[0]);
		int num2 = Integer.parseInt(arr[2]);
		int num3 = Integer.parseInt(arr[4]);

		String sign1 = arr[1];
		String sign2 = arr[3];

		int val1 = calVlaue(calVlaue(num1, num2, sign1), num3, sign2);
		int val2 = calVlaue(num1, calVlaue(num2, num3, sign2), sign1);

		System.out.println(Math.min(val1, val2));
		System.out.println(Math.max(val1, val2));
		sc.close();
    }
}