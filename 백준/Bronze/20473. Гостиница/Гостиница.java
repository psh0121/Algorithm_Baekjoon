import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int two = 0;
		int three = 0;

		if(n % 3 == 0) three = n / 3;
		else if(n % 3 == 1) {
			three = (n / 3) - 1;
			two = 2;
		}
		else if(n % 3 == 2) {
			three = n / 3;
			two = 1;
		}

		System.out.println(two + " " + three);
        sc.close();
    }
}
