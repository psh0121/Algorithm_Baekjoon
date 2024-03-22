import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 0; i < n; i++) {
    		int m = sc.nextInt();
    		
    		int p1 = 0;
    		int p2 = 0;
    		
    		for(int j = 0; j < m; j++) {
    			String v1 = sc.next();
    			String v2 = sc.next();
    			
    			// 비겼을때 
    			if(v1.equals(v2)) continue;
    			
    			// v1 기준 
    			// 바위
    			if(v1.equals("R")) {
    				// 이겼을 때
    				if(v2.equals("S")) p1++;
    				// 졌을 때 
    				else p2++;
    			}
    			// 가위 
    			else if(v1.equals("S")) {
    				// 이겼을 때
    				if(v2.equals("P")) p1++;
    				// 졌을 때 
    				else p2++;
    			}
    			// 보 
    			else if(v1.equals("P")) {
    				// 이겼을 때
    				if(v2.equals("R")) p1++;
    				// 졌을 때 
    				else p2++;
    			}
    			
    		}
    		
    		if(p1 > p2) System.out.println("Player 1");
    		else if(p1 == p2) System.out.println("TIE");
    		else System.out.println("Player 2");
    	}
    	
    	sc.close();
    }
}