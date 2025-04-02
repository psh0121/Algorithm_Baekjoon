import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		for(int i = 0; i < cnt; i++) {
			int pIf = sc.nextInt();
			int pWhile = sc.nextInt();
			
			if((pIf <= 1 && pWhile <= 2) || (pIf <= 2 && pWhile <= 1) ) {
				System.out.println("Yes");
			}
			else System.out.println("No");
		}
	}
}         