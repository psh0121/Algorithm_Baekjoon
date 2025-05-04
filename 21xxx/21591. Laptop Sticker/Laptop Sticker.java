import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int wc = sc.nextInt() - 2;
		int hc = sc.nextInt() - 2;
		int ws = sc.nextInt();
		int hs = sc.nextInt();
		
		if(ws <= wc && hs <= hc) System.out.println(1);
		else System.out.println(0);
	}
}         