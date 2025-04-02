import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int need = sc.nextInt();
		
		int result = 0;
		
		for(int i = 0; i < cnt; i++) {
			int pay = sc.nextInt();
			
			result += pay / need;
		}
		
		System.out.println(result);
	}
}         