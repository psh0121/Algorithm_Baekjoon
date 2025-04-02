import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		int b = sc.nextInt();
    		int n = sc.nextInt();
    		
    		if(b == 0 && n == 0) break;
    		
    		int a = 1;
    		int minDistance = Integer.MAX_VALUE;
    		int result = 1;
    		
    		while(true) {
    			int temp = (int) Math.pow(a, n);
    			int distance = Math.abs(temp - b);
    			
    			if(distance < minDistance) {
    				minDistance = distance;
    				result = a;
    			}
    			else break;
    			
    			a++;
    		}
    		
    		System.out.println(result);
    	}
    	
    	sc.close();
    }
}