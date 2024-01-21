import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		double sqrtNum = Math.sqrt(num);
		
		System.out.println(sqrtNum * 4);
	}
}         
