import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(sc.hasNext()) {
			num = sc.nextInt();
			if(num == 0) break;
			
			for(int i = 1; i <= num; i++) {
				System.out.println("*".repeat(i));
			}
		}
	}
}         
