import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int totalCnt = sc.nextInt() * sc.nextInt();
		
		while(sc.hasNext()) {
			System.out.print((sc.nextInt() - totalCnt) + " ");
		}
	}
}         
