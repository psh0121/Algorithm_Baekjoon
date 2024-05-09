import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	while(sc.hasNext()) {
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		int c = 0;
    		
    		if(a == 0 && b == 0) break;
    		
    		if(a < b) System.out.println("0 " + a + " / " + b);
    		else {
    			c = a / b;
    			a = a % b;
    			
    			System.out.println(c + " " + a + " / " + b);
    		}
    	}
    	
    	sc.close();
    }
}