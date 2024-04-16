import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 0; i < n; i++) {
    		int num = sc.nextInt();
    		int total = 1;
    		
    		for(int j = 2; j <= Math.sqrt(num); j++) {
    			if(num % j == 0) {
    				if(num / j == j) total += j;
    				else total += j + (num/j);
    			}
    		}
    		
    		if(total < num) System.out.println(num + " is a deficient number.");
    		else if(total == num) System.out.println(num + " is a perfect number.");
    		else System.out.println(num + " is an abundant number.");
    		
    		System.out.println();
    	}
    	
    	sc.close();
    }
}