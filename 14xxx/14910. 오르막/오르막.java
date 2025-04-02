import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String[] strArr = sc.nextLine().split(" ");
		
		int[] arr = new int[strArr.length];
		int[] sortArr = new int[strArr.length];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
			sortArr[i] = Integer.parseInt(strArr[i]);
		}

		Arrays.sort(sortArr);

		boolean isCorrect = true;

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != sortArr[i]) {
				isCorrect = false;
				break;
			}
		}

		System.out.println(isCorrect == true ? "Good" : "Bad");
		sc.close();
    }
}
