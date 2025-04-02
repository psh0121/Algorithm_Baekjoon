import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		
		for(int i = 0; i < n; i++) {
			String pepper = sc.next();
			
			switch(pepper) {
			case "Poblano":
				result += 1500;
				break;
			case "Mirasol":
				result += 6000;
				break;
			case "Serrano":
				result += 15500;
				break;
			case "Cayenne":
				result += 40000;
				break;
			case "Thai":
				result += 75000;
				break;
			case "Habanero":
				result += 125000;
				break;
			}
		}
		
		System.out.println(result);
	}
}