import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int rank16 = sc.nextInt();
		int result = 0;
		
		for(int i = 0; i < 4; i++) {
			if(rank16 - sc.nextInt() <= 1000) result++;
		}
		
		System.out.println(result);
	}
}         
