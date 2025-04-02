import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String l = sc.next();
		int num = 0;

		for(int i = 0; i < n; i++) {
			while (true) {
				num += 1;

				if(!Integer.toString(num).contains(l)) break;
			}
		}

		System.out.println(num);
		sc.close();
    }
}
