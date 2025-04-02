import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		long result = (long)0;

		for(int i = 0; i < n; i++) {
			double student = (double) arr[i];

			if(student <= b) result++;
			else {
				result++;
				result += 1l * Math.ceil((student - b) / c);
			}
		}

		System.out.println(result);
		sc.close();
    }
}
