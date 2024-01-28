import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int g = sc.nextInt();
		int p = sc.nextInt();
		int t = sc.nextInt();
		
		int person = g * p;
		int group = g + (t * p);
		
		int result = 0;
		
		if(person < group) result = 1;
		else if(person == group) result = 0;
		else result = 2;
		
		System.out.println(result);
	}
}