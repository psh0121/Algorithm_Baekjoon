import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int cnt = 0;

		for(int i = 0; i < 8; i++) {
			String color = i % 2 == 0 ? "white" : "black";
			String board = sc.next();

			for(int j = 0; j < 8; j++) {
				if(color.equals("white") && board.charAt(j) == 'F') {
					cnt++;
				}

				color = color.equals("white") ? "black" : "white";
			}
		}

		System.out.println(cnt);
		sc.close();
    }
}
