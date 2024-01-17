import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		String[] arr = sc.nextLine().split(" ");
		
		int cnt = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(num == Integer.parseInt(arr[i])) cnt++;
		}
		
		System.out.println(cnt);
	}
}         
