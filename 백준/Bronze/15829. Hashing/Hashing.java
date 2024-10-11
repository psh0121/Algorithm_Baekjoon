import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		int[] arr = new int[n];

		for(int i = 0; i < n; i++) {
			char letter = str.charAt(i);
			int val = (int)letter - 96;
			arr[i] = val;
		}

		long result = (long)0;

		for(int i = 0; i < arr.length; i++) {
			result += 1l * arr[i] * Math.pow(31, i);
		}
		System.out.println(result);
		sc.close();
    }
}
