import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 0; i < n; i++) {
    		int h = sc.nextInt();
    		int w = sc.nextInt();
    		int customer = sc.nextInt();
    		int cnt = 0;
    		
    		int xx = 0;
    		int yy = 1;
    		
    		while(cnt < customer) {
    			cnt++;
    			
    			xx++;
    			
    			if(xx > h) {
    				yy++;
    				xx = 1;
    			}
    		}
    		
    		String result = Integer.toString(xx);
    		
    		if(yy < 10) result += "0" + yy;
    		else result += yy;
    		
    		System.out.println(result);
    	}
    	
    	sc.close();
    }
}