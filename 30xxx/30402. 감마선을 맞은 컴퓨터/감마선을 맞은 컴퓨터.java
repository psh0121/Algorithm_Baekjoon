import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String val;
		
		while(sc.hasNextLine()) {
			val = sc.nextLine();
			
			if(val.contains("w")) {
				System.out.println("chunbae");
				break;
			}
			else if(val.contains("b")) {
				System.out.println("nabi");
				break;
			}
			else if(val.contains("g")) {
				System.out.println("yeongcheol");
				break;
			}
		}
	}
}         
