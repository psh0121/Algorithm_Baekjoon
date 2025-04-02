import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

		char[] arr = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
		int[] num = {1, 5, 10, 50, 100, 500, 1000};

		for(int i = 0; i < n; i++) {
			String str = sc.nextLine();
			int year = 0;
			for(int j = 0; j < str.length(); j++) {

				for(int k = 0; k < arr.length; k++) {
					if(str.charAt(j) == arr[k]) {
						year += num[k];
						break;
					}
				}
			}

			System.out.println(year);
		}
        sc.close();
    }
}
