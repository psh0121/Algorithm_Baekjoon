import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] arr = new int[cnt];
		int findNum;
		int result = 0;
		
		for(int i = 0; i < cnt; i++) {
			arr[i] = sc.nextInt();
		}
		
		findNum = sc.nextInt();
		
		for(int i = 0; i < cnt; i++) {
			if(arr[i] == findNum) result++;
		}
		
		System.out.println(result);
	}
}         