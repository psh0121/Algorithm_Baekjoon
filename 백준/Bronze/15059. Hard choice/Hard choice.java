import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String[] strMeal = sc.nextLine().split(" ");
		String[] strHope = sc.nextLine().split(" ");
		
		int[] meal = new int[strMeal.length];
		int[] hope = new int[strHope.length];
		
		for(int i = 0; i < meal.length; i++) {
			meal[i] = Integer.parseInt(strMeal[i]);
			hope[i] = Integer.parseInt(strHope[i]);
		}
		
		int result = 0;
		
		for(int i = 0; i < meal.length; i++) {
			if(hope[i] - meal[i] > 0) result += (hope[i] - meal[i]);
		}
		
		System.out.println(result);
		
		sc.close();
	}
}         
