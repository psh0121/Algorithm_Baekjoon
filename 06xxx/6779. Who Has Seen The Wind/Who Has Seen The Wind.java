import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int h = sc.nextInt();
    	int m = sc.nextInt();
    	
    	for(int i = 1; i <= m; i++) {
    		int value = (int) (-6 * Math.pow(i, 4) + h * Math.pow(i, 3) + 2 * Math.pow(i, 2) + i);
    		
    		if(value <= 0) {
    			System.out.println("The balloon first touches ground at hour: " + i);
    			return;
    		}
    	}
    	
    	System.out.println("The balloon does not touch ground in the given time.");
    	
    	sc.close();
    }
}