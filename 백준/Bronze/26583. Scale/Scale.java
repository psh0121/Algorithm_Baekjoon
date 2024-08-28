import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			String[] arrStr = sc.nextLine().split(" ");
			int[] arr = new int[arrStr.length];
			for(int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(arrStr[i]);

			int[] result = new int[arr.length];

			for(int i = 0; i < arr.length; i++) {
				if(i == 0) {
					result[i] = arr[i] * arr[i+1];
				}
				else if(i == arr.length - 1) {
					result[i] = arr[i-1] * arr[i];
				}
				else {
					result[i] = arr[i-1] * arr[i] * arr[i+1];
				}
			}

			StringBuilder sb = new StringBuilder();

			for(int i = 0; i < result.length; i++) {
				sb.append(result[i]);
				
				if(i < result.length - 1) sb.append(" ");
			}

			String resStr = sb.toString();

			System.out.println(resStr);
		}
        sc.close();
    }
}
