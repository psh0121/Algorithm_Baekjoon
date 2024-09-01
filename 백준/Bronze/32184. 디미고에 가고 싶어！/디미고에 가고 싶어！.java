import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int pic = 0;

		if(a % 2 == 0) {
			a++;
			pic++;
		}

		if (b % 2 == 1) {
			b--;
			pic++;
		}

		for(int i = a; i <= b; i+=2) pic++;

		System.out.println(pic);
        sc.close();
    }
}
