import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int o = sc.nextInt();
		int a = sc.nextInt();
		int k = sc.nextInt();

		boolean find = false;

		for(int i = 1; i <= o; i++) {
			for(int j = 1; j <= o; j++) {
				if(i * a + j * k == o) {
					find = true;
					break;
				}
			}

			if(find) break;
		}

		System.out.println(find ? 1: 0);

        sc.close();
    }
}
