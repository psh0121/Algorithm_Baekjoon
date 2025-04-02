import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int result = 0;
		
		while(sc.hasNext()) {
			String path = sc.next();
			int cnt = sc.nextInt();
			
			if(path.equals("Es")) result += (21 * cnt);
			else result += (17 * cnt);
		}
		
		System.out.println(result);
	}
}