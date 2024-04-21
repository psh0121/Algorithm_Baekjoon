import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 0; i < n; i++) {
    		double r = 0.0;
    		double g = 0.0;
    		double b = 0.0;
    		
    		for(int j = 0; j < 10; j++) {
    			r += sc.nextDouble();
    			g += sc.nextDouble();
    			b += sc.nextDouble();
    		}
    		
    		r /= 10;
    		g /= 10;
    		b /= 10;
    		
    		System.out.println(Math.round(r) + " " + Math.round(g) + " " + Math.round(b));
    	}
    	
    	sc.close();
    }
}