import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		if(cnt >= 8) System.out.println("satisfactory");
		else System.out.println("unsatisfactory");
	}
}         