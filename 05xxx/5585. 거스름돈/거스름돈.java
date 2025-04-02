import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int money = 1000 - sc.nextInt();
		int[] coin = {500, 100, 50, 10, 5, 1};
		int result = 0;

		for(int i = 0; i < coin.length; i++) {
			result += money / coin[i];
			money %= coin[i];
		}

		System.out.println(result);
		sc.close();
    }
}
