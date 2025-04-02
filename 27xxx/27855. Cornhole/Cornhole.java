import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int p1 = (sc.nextInt() * 3) + sc.nextInt();
		int p2 = (sc.nextInt() * 3) + sc.nextInt();
		
		if(p1 > p2) System.out.println("1 " + (p1-p2));
		else if(p1 == p2) System.out.println("NO SCORE");
		else System.out.println("2 " + (p2-p1));
	}
}