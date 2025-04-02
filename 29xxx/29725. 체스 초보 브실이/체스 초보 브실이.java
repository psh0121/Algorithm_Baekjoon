import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String[] value = {".", "k", "p", "n", "b", "r", "q"};
		int[] point = {0, 0, 1, 3, 3, 5, 9};
		
		int result = 0;
		
		for(int i = 0; i < 8; i++) {
			String[] chess = sc.nextLine().split("");
			for(int j = 0; j < 8; j++) {
				// 백
				if(chess[j].equals(chess[j].toUpperCase()) ) {
					result += point[Arrays.asList(value).indexOf(chess[j].toLowerCase())];
				}
				
				// 흑 
				else {
					result -= point[Arrays.asList(value).indexOf(chess[j])];
				}
			}
		}
		
		System.out.println(result);
	}
}         