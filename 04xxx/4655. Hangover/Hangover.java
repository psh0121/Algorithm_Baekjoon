import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		double num = sc.nextDouble();
    		if(num == 0.00) break;
    		
    		int cnt = 0;
    		double cm = 0.00;
    		int n = 2;
    		
    		while(true) {
    			cnt++;
    			cm += 1.0/n++;
    			
    			if(cm >= num) break;
    		}
    		
    		System.out.println(cnt + " card(s)");
    	}
    	
    	sc.close();
    }
}