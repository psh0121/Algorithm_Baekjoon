import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String top = "";
		String bottom = "";

		for(int i = 1; i <= n; i++) {
			if(i % 2 == 1) top += "* ";
			else bottom += "* ";
		}

		top = top.trim();
		bottom = bottom.trim();
		bottom = " " + bottom;

		for(int i = 1; i <= n; i++) {
			if(n == 1) {
				System.out.println(top);
				break;
			}

			System.out.println(top);
			System.out.println(bottom);
		}

		sc.close();
    }
}
