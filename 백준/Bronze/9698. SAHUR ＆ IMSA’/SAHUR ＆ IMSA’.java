import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	
    	for(int i = 1; i <= t; i++) {
    		int h = sc.nextInt();	// hour
    		int m = sc.nextInt();	// min
    		
    		if(m - 45 < 0) {
    			h--;
    			m = (m+60) - 45;
    		}
    		else {
    			m = m - 45;
    		}
    		
    		if(h < 0) h += 24;
    		
    		System.out.println("Case #" + i + ": " + h + " " + m);
    	}
    	
    	sc.close();
    }
}