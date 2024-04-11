import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int num = 1;
    	
    	while(true) {
    		double a = sc.nextDouble();
    		double b = sc.nextDouble();
    		double c = sc.nextDouble();
    		
    		if(a == 0 && b == 0 && c == 0) break;
    		
    		System.out.println("Triangle #" + num++);
    		
    		double value;
    		String res;
    		
    		if(a == -1) {
    			if(b >= c) System.out.println("Impossible.");
    			else {
    				value = Math.sqrt(c*c - b*b);
    				res = String.format("%.3f", value);
    				System.out.println("a = " + res);
    			}
    			
    		}
    		else if(b == -1) {
    			if(a >= c) System.out.println("Impossible.");
    			else {
    				value = Math.sqrt(c*c - a*a);
    				res = String.format("%.3f", value);
    				System.out.println("b = " + res);
    			}
    		}
    		else {
    			value = Math.sqrt(a*a + b*b);
				res = String.format("%.3f", value);
				System.out.println("c = " + res);
    		}
    		System.out.println();
    	}
    }
}