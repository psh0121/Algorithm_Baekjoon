import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int man = 0;
		int girl = 0;
		
		while(true) {
			man = sc.nextInt();
			girl = sc.nextInt();
			
			if(man == 0 && girl == 0) break;
			
			System.out.println(man + girl);
		}
	}
}         
