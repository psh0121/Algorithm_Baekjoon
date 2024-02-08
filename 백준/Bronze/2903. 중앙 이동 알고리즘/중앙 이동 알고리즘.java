import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int turn = sc.nextInt();
		int rowPoint = 2;
		
		for(int i = 0; i < turn; i++) {
			rowPoint = rowPoint + (rowPoint-1);
		}
		
		System.out.println(rowPoint * rowPoint);
	}
}

