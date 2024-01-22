import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int v = sc.nextInt();
		v = Math.max(v, len-v);
		int h = sc.nextInt();
		h = Math.max(h, len-h);
		
		System.out.println(v * h * 4);
	}
}         