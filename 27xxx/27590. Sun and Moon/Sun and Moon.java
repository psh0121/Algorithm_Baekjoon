import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int sun = sc.nextInt();
		int sunTime = sc.nextInt();
		sun = Math.abs(sun - sunTime);
		
		int moon = sc.nextInt();
		int moonTime = sc.nextInt();
		moon = Math.abs(moon - moonTime);
		
		while(true) {
			if(sun == moon) break;
			
			if(sun < moon) sun += sunTime;
			else if(moon < sun) moon += moonTime;
		}
		
		System.out.println(sun);
	}
}