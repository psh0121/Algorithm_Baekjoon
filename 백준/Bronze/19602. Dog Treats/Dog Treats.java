import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt() + sc.nextInt() * 2 + sc.nextInt() * 3;
		
		if(cnt >= 10) System.out.println("happy");
		else System.out.println("sad");
	}
}         