import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int tall = sc.nextInt();
		int hope = sc.nextInt();
		int cm = sc.nextInt();
		
		int cnt = 0;
		
		while(tall < hope) {
			tall += cm;
			cnt++;
		}
		
		System.out.println(cnt);
	}
}         
