import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int k = sc.nextInt();
		int h = sc.nextInt();
		
		int minNum = Math.min(s, Math.min(k, h));
		
		if(s + k + h >= 100) System.out.println("OK");
		else {
			if(s == minNum) System.out.println("Soongsil");
			else if(k == minNum) System.out.println("Korea");
			else System.out.println("Hanyang");
		}
	}
}         