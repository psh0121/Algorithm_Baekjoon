import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Integer[] arr = new Integer[n];
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(sc.next());
		Arrays.sort(arr, Collections.reverseOrder());

		System.out.println(arr[k-1]);
		sc.close();
    }
}
