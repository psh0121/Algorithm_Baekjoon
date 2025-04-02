import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();

		while (true) {
			int y = sc.nextInt();

			if(d > y) d += y;
			else break;
		}

		System.out.println(d);
		sc.close();
    }
}
