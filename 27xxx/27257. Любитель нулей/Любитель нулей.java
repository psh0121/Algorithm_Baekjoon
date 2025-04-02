import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String[] arr = sc.next().split("");
		
		int cnt = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals("0")) cnt++;
		}
		
		for(int i = arr.length - 1; i >= 0; i--) {
			if(arr[i].equals("0")) cnt--;
			else break;
		}
		
		System.out.println(cnt);
	}
}