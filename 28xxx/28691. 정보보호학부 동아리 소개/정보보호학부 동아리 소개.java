import java.util.Scanner;

public class Main {

	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		String val = sc.next();
		
		String result;
		
		switch(val) {
		case "M": 
			result = "MatKor";
		break;
		
		case "W": 
			result = "WiCys";
		break;
		
		case "C": 
			result = "CyKor";
		break;
		
		case "A": 
			result = "AlKor";
		break;
		
		default:
			result = "$clear";
		break;
		}
		
		System.out.println(result);
	}
}         
