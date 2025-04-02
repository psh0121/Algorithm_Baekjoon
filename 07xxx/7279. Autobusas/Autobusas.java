import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int k = sc.nextInt();
    	
    	int sit = 0;
    	int stand = 0;
    	
    	int maxStand = 0;
    	
    	for(int i = 0; i < n; i++) {
    		sit += sc.nextInt();
    		sit -= sc.nextInt();
    		
    		if(sit > k) {
    			stand += sit - k;
    			sit = k;
    			
    			maxStand = Math.max(maxStand, stand);
    		}
    	}
    	
    	System.out.println(maxStand);
    	sc.close();
    }
}