import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int e = sc.nextInt();
		int f = sc.nextInt();
		int c = sc.nextInt();

		int curBottle = e + f;

		int result = 0;

		while (curBottle >= c) {
			int newDrink = curBottle / c;
			result += newDrink;

			curBottle %= c;
			curBottle += newDrink;
		}

		System.out.println(result);
		sc.close();
    }
}
