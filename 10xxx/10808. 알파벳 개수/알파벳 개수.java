import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		int[] arr = new int[26];
		Arrays.fill(arr, 0);
		
		Scanner sc = new Scanner(System.in);
		String[] value = sc.next().split("");
		
		for(int i = 0; i < value.length; i++) {
			arr[alpha.indexOf(value[i])]++;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}         
