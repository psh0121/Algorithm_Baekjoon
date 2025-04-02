import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String[] socks = sc.next().split("");
		int b = 0;
		int c = 0;
		
		for(int i = 0; i < socks.length; i++) {
			if(socks[i].equals("B")) b++;
			else c++;
		}
		
		System.out.println((b/2) + (c/2));
	}
}