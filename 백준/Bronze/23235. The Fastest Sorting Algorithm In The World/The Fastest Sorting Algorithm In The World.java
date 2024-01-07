import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		
		while(sc.hasNextLine()) {
			if("0".equals(sc.nextLine())) break;
			System.out.println("Case " + cnt + ": Sorting... done!");
			cnt++;
		}
	}
}         
