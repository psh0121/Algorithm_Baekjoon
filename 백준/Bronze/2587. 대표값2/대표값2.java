import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();

		int sum = 0;
		int mid = 0;

		for(int i = 0; i < arr.length; i++) sum += arr[i];

		Arrays.sort(arr);

		mid = arr[2];

		System.out.println(sum / 5);
		System.out.println(mid);
		sc.close();
    }
}
