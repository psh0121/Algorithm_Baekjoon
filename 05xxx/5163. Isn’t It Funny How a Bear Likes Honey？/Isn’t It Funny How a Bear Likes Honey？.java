import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 1; i <= n; i++) {
    		int b = sc.nextInt();
    		double w = sc.nextDouble();
    		System.out.println("Data Set " + i + ":");
    		
    		double possibleW = 0.0;
    		for(int j = 0; j < b; j++) {
    			possibleW += (double)4 / 3 * Math.PI * Math.pow(sc.nextDouble(), 3);
    		}
    		
    		if((double)possibleW / 1000 >= w) System.out.println("Yes");
    		else System.out.println("No");
    		System.out.println();
    	}
    	
    	sc.close();
    }
}