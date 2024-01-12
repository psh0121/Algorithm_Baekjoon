import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int cnt = sc.nextInt();
			
			if(cnt == 0) break;
			
			int[] arr = new int[cnt];
			
			for(int i = 0; i < cnt; i++) arr[i] = sc.nextInt();
			
			for(int i = cnt - 1; i >= 0; i--) System.out.println(arr[i]);
			System.out.println(0);
			
		}
	}
}         
