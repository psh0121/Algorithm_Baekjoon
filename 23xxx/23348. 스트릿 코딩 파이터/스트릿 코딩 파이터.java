import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int dA = sc.nextInt();
		int dB = sc.nextInt();
		int dC = sc.nextInt();

		int n = sc.nextInt();
		int[] arr = new int[n];	// 동아리별 난이도 점수

		for(int i = 0; i < n; i++) {
			int grade = 0;

			for(int j = 0; j < 3; j++) {
				grade += sc.nextInt() * dA;
				grade += sc.nextInt() * dB;
				grade += sc.nextInt() * dC;
			}

			arr[i] = grade;
		}

		Arrays.sort(arr);
		System.out.println(arr[arr.length - 1]);
		
		sc.close();
    }
}