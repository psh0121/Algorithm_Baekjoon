import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = sc.nextInt();
		int[] arr = new int[n * m + 1];
		for(int i = 1; i < n*m+1; i++) arr[i] = sc.nextInt();

		int totalFee = 0;

		for(int i = 1; i < arr.length; i++) {
			int upHouse = i + m;

			if(upHouse >= arr.length) continue;

			if(arr[upHouse] > 2 * arr[i]) totalFee += a;
		}

		System.out.println(totalFee);
		sc.close();
    }
}
