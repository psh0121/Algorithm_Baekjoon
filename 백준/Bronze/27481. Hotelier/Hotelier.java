import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[10];
		String[] valueArr = sc.next().split("");

		for(int i = 0; i < n; i++) {
			String value = valueArr[i];

			if(value.equals("L")) {
				for(int j = 0; j < 10; j++) {
					if(arr[j] == 0) {
						arr[j] = 1;
						break;
					}
				}
			}
			else if(value.equals("R")) {
				for(int j = 9; j >= 0; j--) {
					if(arr[j] == 0) {
						arr[j] = 1;
						break;
					}
				}
			}
			else {
				int numValue = Integer.parseInt(value);
				arr[numValue] = 0;
			}
		}

		String result = "";

		for(int i = 0; i <= 9; i++) result += arr[i];

		System.out.println(result);
        sc.close();
    }
}
