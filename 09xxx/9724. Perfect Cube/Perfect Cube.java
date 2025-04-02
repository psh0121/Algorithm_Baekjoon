import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	
    	for(int i = 1; i <= t; i++) {
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		
    		int cnt = 0;
    		for(int j = (int)Math.ceil(Math.cbrt(a)); j <= (int)Math.floor(Math.cbrt(b)); j++) {
    			int threeV = j * j * j;
    			
    			if(threeV >= a && threeV <= b) cnt++;
    		}
    		
    		System.out.println("Case #" + i + ": " + cnt);
    	}
    	
    	sc.close();
    }
}