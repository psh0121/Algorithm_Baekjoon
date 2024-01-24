import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		long w = sc.nextLong();
		long b = sc.nextLong();
		
		long cnt = 0;
		
		if(w < b) cnt = w + 1;
		else cnt = b;
		
		System.out.println(cnt);
	}
}         