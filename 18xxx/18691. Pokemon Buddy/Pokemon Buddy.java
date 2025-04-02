import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		for(int i = 0; i < cnt; i++) {
			int g = sc.nextInt();
			int c = sc.nextInt();
			int e = sc.nextInt();
			
			int result = 0;
			
			if(g == 1) result = e - c;
			else if(g == 2) result = (e - c) * 3;
			else result = (e - c) * 5;
			
			if(e - c <= 0) System.out.println(0);
			else System.out.println(result);
		}
	}
}         