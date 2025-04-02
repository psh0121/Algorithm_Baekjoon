import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		int income = sc.nextInt();
    		
    		if(income == 0) break;
    		
    		if(income <= 1000000) System.out.println(income);
    		else if(income > 1000000 && income <= 5000000) System.out.println(income - (int)(income * 0.1));
    		else System.out.println(income - (int)(income * 0.2));
    	}
    	sc.close();
    }
}