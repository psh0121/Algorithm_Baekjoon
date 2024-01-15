import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		long row = sc.nextLong();
		long col = sc.nextLong();
		
		if(row % 2 == 0 || col % 2 == 0) System.out.println(0);
		else System.out.println(Math.min(col, row));
	}
}         
