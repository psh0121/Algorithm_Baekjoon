import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int apple = sc.nextInt() * 3 + sc.nextInt() * 2 + sc.nextInt();
		int banana = sc.nextInt() * 3 + sc.nextInt() * 2 + sc.nextInt();
		
		if(apple > banana) System.out.println("A");
		else if(apple == banana) System.out.println("T");
		else System.out.println("B");
	}
}         