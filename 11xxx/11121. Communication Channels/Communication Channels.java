import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		String a, b;
		
		for(int i = 0; i < cnt; i++) {
			a = sc.next();
			b = sc.next();
			
			if(a.equals(b)) System.out.println("OK");
			else System.out.println("ERROR");
		}
	}
}         
