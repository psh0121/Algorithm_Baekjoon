import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		String[] arr = sc.next().split("");
		
		int sum = 0;
		
		for(int i = 0; i < cnt; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		
		System.out.println(sum);
	}
}         
