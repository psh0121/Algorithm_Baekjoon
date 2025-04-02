import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		long totalSum = 0;

		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			totalSum += arr[i];
		}

		long bossStrength = totalSum / 2;

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			if(arr[i] != bossStrength) {
				sb.append(arr[i]).append(" ");
			}
		}
		sb.append(bossStrength);
		System.out.println(sb.toString().trim());
		sc.close();
    }
}
