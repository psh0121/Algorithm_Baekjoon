import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int result = 0;
		
		for(int i = 0; i < n; i++) {
			String str = sc.next();
			
			if(str.contains("+")) result++;
		}
		
		System.out.println(result);
	}
}         