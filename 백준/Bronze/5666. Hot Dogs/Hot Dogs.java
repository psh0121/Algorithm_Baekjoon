import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(sc.hasNext()) {
    		double h = sc.nextDouble();
    		double p = sc.nextDouble();
    		
    		double result = h/p;
    		
    		System.out.println(String.format("%.2f", result));
    	}
    	 
    	sc.close();
    }
}