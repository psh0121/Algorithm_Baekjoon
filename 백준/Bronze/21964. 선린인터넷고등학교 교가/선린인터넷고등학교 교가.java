import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		String str = sc.nextLine();
		
		System.out.println(str.substring(num - 5, num));
	}
}         