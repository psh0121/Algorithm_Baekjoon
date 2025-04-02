import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());

		for(int i = 0; i < t; i++) {
			String[] arr = sc.nextLine().split(" ");
			double num = Double.parseDouble(arr[0]);

			for(int j = 1; j < arr.length; j++) {
				if(arr[j].equals("@")) {
					num *= 3;
				}
				else if(arr[j].equals("%")) {
					num += 5;
				}
				else {
					num -= 7;
				}
			}

			System.out.printf("%.2f\n", num);
		}
		sc.close();
    }
}
