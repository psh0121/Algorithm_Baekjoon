import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		int k = sc.nextInt();

		long result = (long)0;

		for(int i = 0; i < n; i++) {
			int fileSize = arr[i];

			if(fileSize == 0) result += 0;
			else if(fileSize <= k) result += k;
			else if(fileSize % k == 0) result += (long)(fileSize / k) * k;
			else result += (long)((fileSize / k) + 1) * k;
		}

		System.out.println(result);

		sc.close();
    }
}
