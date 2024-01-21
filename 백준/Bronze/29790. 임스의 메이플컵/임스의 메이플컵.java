import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 문제 해결 개수 
		int u = sc.nextInt();	// 유니온 레벨 
		int l = sc.nextInt();	// 최고 레벨 
		
		if(n >= 1000) {
			if(u >= 8000 || l >= 260) System.out.println("Very Good");
			else System.out.println("Good");
		}
		else System.out.println("Bad");
	}
}         