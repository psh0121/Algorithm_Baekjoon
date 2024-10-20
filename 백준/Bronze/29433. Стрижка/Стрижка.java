import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] result = new int[n];

		for(int i = 0; i < k; i++) {
			result[i] = (i+1) % k + 1;
		}

		int hairDesign = 1;

		for(int i = k; i < n; i++) {
			result[i] = hairDesign++;
			if(hairDesign > k) hairDesign = 1;
		}

		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i]);

			if(i != result.length - 1) {
				System.out.print(" ");
			}
		}
		sc.close();
    }
}
