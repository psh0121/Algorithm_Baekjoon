import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		for(int i = 0; i < n; i++) {
			String[] arr = sc.nextLine().split(" ");
			String result = "";

			for(int j = 2; j < arr.length; j++) {
				result += arr[j] + " ";
			}

			result += arr[0] + " " + arr[1];

			System.out.println(result);
		}
		sc.close();
    }
}
