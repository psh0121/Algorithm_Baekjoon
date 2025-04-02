import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int balance = sc.nextInt();
			String value = sc.next();
			int price = sc.nextInt();
			
			if(balance == 0 && value.equals("W") && price == 0) break;
			
			if(value.equals("W")) balance -= price;
			else balance += price;
			
			if(balance < -200) System.out.println("Not allowed");
			else System.out.println(balance);
		}
	}
}

