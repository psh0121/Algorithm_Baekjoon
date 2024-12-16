import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] lights = new int[n];
		for(int i = 0; i < lights.length; i++) lights[i] = sc.nextInt();

		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			if(a == 1) {
				lights[b-1] = c;
			}
			else if(a == 2) {
				for(int j = b-1; j <= c-1; j++) {
					lights[j] = lights[j] == 0 ? 1 : 0;
				}
			}
			else if(a == 3) {
				for(int j = b-1; j <= c-1; j++) {
					lights[j] = 0;
				}
			}
			else {
				for(int j = b-1; j <= c-1; j++) {
					lights[j] = 1;
				}
			}
		}

		String result = "";
		for(int i = 0; i < lights.length; i++) {
			result += lights[i] + " ";
		}

		System.out.println(result.trim());
		sc.close();
    }
}
