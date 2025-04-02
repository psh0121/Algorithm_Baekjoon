import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int x = sc.nextInt();
		int y = sc.nextInt();

		int[] distanceArr = new int[3];

		// 직접운반
		distanceArr[0] = Math.abs(b - a);

		// a -> x ...... y -> b
		distanceArr[1] = Math.abs(a - x) + Math.abs(y - b);

		// a -> y ...... x -> b
		distanceArr[2] = Math.abs(a - y) + Math.abs(x - b);
		
		Arrays.sort(distanceArr);
		
		System.out.println(distanceArr[0]);
		sc.close();
    }
}