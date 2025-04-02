import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int aValue = sc.nextInt() + (sc.nextInt() * 10);
		int maxValue = Integer.MIN_VALUE;

		for(int i = 0; i < 5; i++) {
			int value = sc.nextInt() + (sc.nextInt() * 10);
			maxValue = Math.max(maxValue, value);
		}

		if(aValue > maxValue) System.out.println(0);
		else {
			System.out.println(maxValue - aValue + 1);
		}
		sc.close();
    }
}
