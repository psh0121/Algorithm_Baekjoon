import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] numArr = new int[5];
		int result = 0;
		
		for(int i = 0; i < 5; i++) {
			numArr[i] = sc.nextInt();
			numArr[i] *= numArr[i];
		}
		
		for(int i = 0; i < 5; i++) {
			result += numArr[i];
		}
		
		result %= 10;
		
		System.out.println(result);
	}

}