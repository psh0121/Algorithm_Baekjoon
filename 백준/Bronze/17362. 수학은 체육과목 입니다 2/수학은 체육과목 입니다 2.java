import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		num %= 8;
		
		if(num > 5 || num == 0) {
			System.out.println((10 - num) % 8);
		}
		else System.out.println(num);
	}
}         