import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int times;
		
		for(int i = 0; i < cnt; i++) {
			times = sc.nextInt();
			
			System.out.println(sc.next().repeat(times));
		}
	}
}         