import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] chessArr = {1, 1, 2, 2, 2, 8};
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < chessArr.length; i++) {
			chessArr[i] -= sc.nextInt();
			
			System.out.print(chessArr[i] + " ");
		}
	}

}