import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			String[] arr = sc.next().split("D-");
			
			if(Integer.parseInt(arr[1]) <= 90) cnt++;
		}
		
		System.out.println(cnt);
	}
}         