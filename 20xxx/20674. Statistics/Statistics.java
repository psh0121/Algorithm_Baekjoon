import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int minValue = Integer.MAX_VALUE;
		int result = 0;

		for(int i = 0; i < n; i++) {
			int value = sc.nextInt();

			if(value <= minValue) {
				minValue = value;
			}
			else {
				result += (value - minValue);
			}
		}

		System.out.println(result);

		sc.close(); 
    }
}
