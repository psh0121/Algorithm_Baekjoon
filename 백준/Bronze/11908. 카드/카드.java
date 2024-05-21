import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] arr = new int[n];
    	int sum = 0;
    	for(int i = 0; i < arr.length; i++) {
    		arr[i] = sc.nextInt();
    		sum += arr[i];
    	}
    	
    	Arrays.sort(arr);
    	
    	System.out.println(sum - arr[arr.length - 1]);
    	
    	sc.close();
    }
}