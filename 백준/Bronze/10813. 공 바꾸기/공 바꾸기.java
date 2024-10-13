import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] basket = new int[n+1];
		for(int i = 0; i < basket.length; i++) {
			basket[i] = i;
		}

		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			int aValue = basket[a];
			int bValue = basket[b];

			basket[a] = bValue;
			basket[b] = aValue;
		}

		for(int i = 1; i < basket.length; i++) {
			System.out.print(basket[i]);

			if(i < basket.length - 1) System.out.print(" ");
		}
		sc.close();
    }
}
