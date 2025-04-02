import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String alphabet = ".ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			String str1 = sc.next();
			String str2 = sc.next();
			System.out.print("Distances:");

			for(int j = 0; j < str1.length(); j++) {
				int x = alphabet.indexOf(str1.charAt(j));
				int y = alphabet.indexOf(str2.charAt(j));

				int distanceXY = 0;

				if(y >= x) distanceXY = y - x;
				else distanceXY = (y+26) - x;

				System.out.print(" " + distanceXY);
			}

			System.out.println();
		}
		sc.close();
    }
}
