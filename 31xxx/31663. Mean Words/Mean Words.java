import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];

		int maxLen = 0;
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.next();
			maxLen = Math.max(maxLen, arr[i].length());
		}

		String result = "";

		for(int i = 0; i < maxLen; i++) {
			int cnt = 0;
			int sum = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j].length() >= i+1) {
					cnt++;
					sum += (int)arr[j].charAt(i);
				}
			}

			result += (char)(sum / cnt);
		}

		System.out.println(result);

        sc.close();
    }
}
