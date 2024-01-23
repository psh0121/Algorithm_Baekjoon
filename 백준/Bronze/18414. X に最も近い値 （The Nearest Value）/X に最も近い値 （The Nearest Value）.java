import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int l = sc.nextInt();
		int r = sc.nextInt();
		
		int result = l;
		
		for(int i = l; i <= r; i++) {
			if(Math.abs(x - result) > Math.abs(x - i)) {
				result = i;
			}
		}
		
		System.out.println(result);
	}
}         