import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	double maxV = Double.MIN_VALUE;
    	double pi = 3.14159;
    	
    	for(int i = 0; i < t; i++) {
    		String type = sc.next();	// 유형
    		double valueV = 0.0;
    		
    		double r = 0.0;
    		double h = 0.0;
    		
    		if(type.equals("S")) {
    			r = sc.nextDouble();
    			valueV = (double)4 / 3 * pi * r * r * r;
    		}
    		else if(type.equals("C")) {
    			r = sc.nextDouble();
    			h = sc.nextDouble();
    			valueV = (double)1 / 3 * pi * r * r * h;
    		}
    		else {
    			r = sc.nextDouble();
    			h = sc.nextDouble();
    			valueV = pi * r * r * h;
    		}
    		
    		maxV = Math.max(maxV, valueV);
    	}
    	
    	System.out.printf("%.3f", maxV);
    	
    	sc.close();
    }
}