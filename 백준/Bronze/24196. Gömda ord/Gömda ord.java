import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int idx = 0;
		String result = "";
		
		while(true) {
			result += arr[idx];
			
			if(idx == arr.length - 1) break;
			
			idx += ((int)arr[idx] - 64);
		}
		
		System.out.println(result);
	}
}         