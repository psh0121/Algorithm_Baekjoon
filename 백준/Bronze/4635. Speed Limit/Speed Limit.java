import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		int num = sc.nextInt();
    		if(num == -1) break;
    		
    		int totalM = 0;
    		int beforeT = 0;
    		
    		for(int i = 0; i < num; i++) {
    			int m = sc.nextInt();
    			int t = sc.nextInt();
    			
    			totalM += m * (t - beforeT);
    			beforeT = t;
    		}
    		
    		System.out.println(totalM + " miles");
    	}
    	
    	sc.close();
    }
}