import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String jinho = sc.next();
		int n = sc.nextInt();
		
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			if(jinho.equals(sc.next())) cnt++;
		}
		
		System.out.println(cnt);
	}
}         