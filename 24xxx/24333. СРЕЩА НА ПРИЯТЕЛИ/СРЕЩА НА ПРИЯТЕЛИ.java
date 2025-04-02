import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
		int r1 = sc.nextInt();
		int l2 = sc.nextInt();
		int r2 = sc.nextInt();
		int k = sc.nextInt();

		int maxL = Math.max(l1, l2);
		int minR = Math.min(r1, r2);

		int value = minR - maxL + 1;
		if(value < 0) value = 0;

		if(k >= maxL && k <= minR) value--;
		if(value < 0) value = 0;

		System.out.println(value);
        sc.close();
    }
}
