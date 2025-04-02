import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int w = sc.nextInt();
		
		int cnt = 0;
		
		if(b < w) cnt = b + (b+1);
		else if(b == w) cnt = b + w;
		else cnt = w + (w+1);
		
		System.out.println(cnt);
	}
}         