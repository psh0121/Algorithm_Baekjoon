import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int sum = 0;

		for(int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		int diff = sum - 100;
		int oneIdx = 0;
		int twoIdx = 0;

		for(int i = 0; i < 9; i++) {
			boolean isBreak = false;
			for(int j = i+1; j < 9; j++) {
				if(arr[i] + arr[j] == diff) {
					oneIdx = i;
					twoIdx = j;

					isBreak = true;
					break;
				}
			}
			if(isBreak) break;
		}

		for(int i = 0; i < 9; i++) {
			if(i == oneIdx || i == twoIdx) continue;
			System.out.println(arr[i]);
		}
		sc.close();
    }
}
