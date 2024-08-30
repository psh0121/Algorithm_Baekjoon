import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String[] strArr = sc.nextLine().split(" ");
		int[] arr = new int[strArr.length];
		for(int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(strArr[i]);

		for(int i = 0; i < arr.length; i++) {
			int num = arr[i];

			int space = 0;

			for(int j = num-1; j > 0; j--) {
				System.out.println(" ".repeat(space++) + "*" + " ".repeat((2 * j)-1) + "*");
			}

			System.out.println(" ".repeat(space) + "*");
		}
        sc.close();
    }
}
