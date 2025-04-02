import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int maxSum = 0;
    	int sum = 0;
    	
    	int beforeT = 0;
    	
    	for(int i = 0; i < n; i++) {
    		int t = sc.nextInt();
    		int m = sc.nextInt();
    		
    		sum += Math.abs(t-beforeT);
    		
    		if(m == 1) {
    			maxSum = Math.max(maxSum, sum);
    			sum = 0;
    		}
    		beforeT = t;
    	}
    	
    	System.out.println(maxSum);
    			
    	sc.close();
    }
}