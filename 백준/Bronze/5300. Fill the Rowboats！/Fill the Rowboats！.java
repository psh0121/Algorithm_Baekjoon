import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		for(int i = 1; i <= cnt; i++) {
			
			System.out.print(i + " ");
			
			if(i % 6 == 0 || i == cnt) System.out.print("Go! ");
		}
	}
}         
