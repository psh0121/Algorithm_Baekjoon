import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		String result = "";

		for(int i = 1; i <= r; i++) {
			for(int k = 1; k <= a; k++) {
				for(int j = 1; j <= c; j++) {
					if(i % 2 == 1) {
						if(j % 2 == 1) {
							result += "X".repeat(b);
						}
						else {
							result += ".".repeat(b);
						}
					}
					else {
						if(j % 2 == 1) {
							result += ".".repeat(b);
						}
						else {
							result += "X".repeat(b);
						}
					}
				}
				result += "\n";
			}
		}

		

		System.out.println(result);
		sc.close();
    }
}
