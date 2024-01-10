import java.util.Scanner;

public class Main {

	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int evenCnt = 0;
		int oddCnt = 0;
		
		for(int i = 0; i < cnt; i++) {
			if(sc.nextInt() % 2 == 0) evenCnt++;
			else oddCnt++;
		}
		
		if(evenCnt > oddCnt) System.out.println("Happy");
		else System.out.println("Sad");
	}
}         
