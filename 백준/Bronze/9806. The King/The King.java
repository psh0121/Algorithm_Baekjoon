import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int sonCnt = sc.nextInt();
    	int exponent = sc.nextInt();
    	
    	int result = 0;
    	
    	if(exponent % 2 == 1) {
    		for(int i = 0; i < sonCnt; i++) {
        		int son = sc.nextInt();
        		
        		if(son < 0) continue;
        		
        		result += Math.pow(son, exponent);
        	}
    	}
    	else {
    		for(int i = 0; i < sonCnt; i++) {
    			int son = sc.nextInt();
    			
    			result += Math.pow(son, exponent);
    		}
    	}
    	
    	System.out.println(result);
    	sc.close();
    }
}