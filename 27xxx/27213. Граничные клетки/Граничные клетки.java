import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		if(w == 1 || h == 1) System.out.println(w * h);
		else System.out.println((w*2) + ((h-2) * 2));
	}
}