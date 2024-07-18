import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = sc.next().split("");

		for(int i = 1; i < n; i++) {
			if(arr[i].equals("J")) {
				System.out.println(arr[i - 1]);
			}
		}
		sc.close();
    }
}
