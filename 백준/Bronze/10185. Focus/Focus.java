import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	
    	for(int i = 0; i < t; i++) {
    		double p = sc.nextDouble();
    		double q = sc.nextDouble();
    		
    		double f = p * q / (p+q);
    		
    		System.out.printf("f = %.1f\n", f);
    	}
    	
    	sc.close();
    }
}