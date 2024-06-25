import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
		Arrays.sort(arr);

		int oddCnt = 0;
		int evenCnt = 0;

		for(int i = 0; i < n; i++) {
			if(arr[i] % 2 == 0) evenCnt++;
			else oddCnt++;
		}

		if(oddCnt >= evenCnt && Math.abs(evenCnt - oddCnt) <= 1) System.out.println(1);
		else System.out.println(0);

		sc.close();
    }
}