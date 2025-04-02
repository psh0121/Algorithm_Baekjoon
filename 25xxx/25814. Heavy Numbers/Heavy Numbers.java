import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		String[] num1Arr = Integer.toString(num1).split("");
		String[] num2Arr = Integer.toString(num2).split("");

		int num1Vlue = num1Arr.length;
		int num1Sum = 0;

		for(int i = 0; i < num1Arr.length; i++) {
			num1Sum += Integer.parseInt(num1Arr[i]);
		}

		num1Vlue *= num1Sum;

		int num2Value = num2Arr.length;
		int num2Sum = 0;

		for(int i = 0; i < num2Arr.length; i++) {
			num2Sum += Integer.parseInt(num2Arr[i]);
		}

		num2Value *= num2Sum;

		if(num1Vlue > num2Value) System.out.println(1);
		else if(num1Vlue == num2Value) System.out.println(0);
		else System.out.println(2);
		sc.close(); 
    }
}
