import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();

		String fiveNum1 = num1.replace("6", "5");
		String fiveNum2 = num2.replace("6", "5");

		String sixNum1 = num1.replace("5", "6");
		String sixNum2 = num2.replace("5", "6");

		int minValue = Integer.parseInt(fiveNum1) + Integer.parseInt(fiveNum2);
		int maxValue = Integer.parseInt(sixNum1) + Integer.parseInt(sixNum2);

		System.out.println(minValue + " " + maxValue);
		sc.close();
    }
}
