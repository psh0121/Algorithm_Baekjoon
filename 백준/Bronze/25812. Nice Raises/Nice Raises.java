import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int r = sc.nextInt();

		int one = 0;
		int two = 0;

		for(int i = 0; i < n; i++) {
			int value = sc.nextInt();

			if(value < r) one++;
			else if(value > r) two++;
		}

		if(one > two) System.out.println(1);
		else if(one == two) System.out.println(0);
		else System.out.println(2);
        sc.close();
    }
}
