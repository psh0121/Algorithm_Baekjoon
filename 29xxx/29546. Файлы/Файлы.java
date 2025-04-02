import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		String[] picture = new String[cnt];
		for(int i = 0; i < cnt; i++) picture[i] = sc.next();
		
		cnt = sc.nextInt();
		for(int i = 0; i < cnt; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			for(int j = start; j <= end; j++) {
				System.out.println(picture[j - 1]);
			}
		}
	}
}         