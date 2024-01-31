import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int l = sc.nextInt();
		int h = sc.nextInt();
		
		int maxNum = Math.max(w, l);
		int minNum = Math.min(w, l);
		
		String result = "good";
		
		if(minNum / h < 2) result = "bad";
		if(maxNum / minNum > 2) result = "bad";
		
		System.out.println(result);
	}
}