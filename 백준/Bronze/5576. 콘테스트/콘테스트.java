import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] wArr  = new int[10];
		int[] kArr = new int[10];

		for(int i = 0; i < 10; i++) wArr[i] = sc.nextInt();
		for(int i = 0; i < 10; i++) kArr[i] = sc.nextInt();

		Arrays.sort(wArr);
		Arrays.sort(kArr);

		int w = wArr[9] + wArr[8] + wArr[7];
		int k = kArr[9] + kArr[8] + kArr[7];

		System.out.println(w + " " + k);
		sc.close();
    }
}
