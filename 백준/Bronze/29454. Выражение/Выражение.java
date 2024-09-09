import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for(int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int sum = 0;

			for(int j = 0; j < arr.length; j++) {
				if(i == j) continue;

				sum += arr[j];
			}

			if(num == sum) {
				System.out.println(i + 1);
				return;
			}
		}
		
		sc.close();
    }
}
