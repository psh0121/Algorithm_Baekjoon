import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name;
		int age, kg = 0;
		
		while(true) {
			name = sc.next();
			age = sc.nextInt();
			kg = sc.nextInt();
			
			if(name.equals("#")) break;
			
			if(age > 17 || kg >= 80) System.out.println(name + " Senior");
			else System.out.println(name + " Junior");
		}
		
	}
}         
