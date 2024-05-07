import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	
    	for(int i = 0; i < t; i++) {
    		double disPrice = sc.nextDouble() * 0.8;
    		
    		System.out.printf("$%.2f\n", disPrice);
    	}
    	
    	sc.close();
    }
}