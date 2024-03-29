import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	double before = sc.nextDouble();
    	double after = sc.nextDouble();
    	
    	while(true) {
    		System.out.printf("%.2f", after - before);
    		System.out.println();
    		
    		before = after;
    		after = sc.nextDouble();
    		
    		if(after == 999) break;
    	}
    	
    	sc.close();
    }
}