import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt();
    	int y = sc.nextInt();
    	
    	int round = 0;
    	
    	int curX = 0;
    	int curY = 0;
    	
    	while(true) {
    		if(round == 0) {
    			curX = x;
    			curY = y;
    			round++;
    			
    			continue;
    		}
    		
    		curX += x;
    		
    		if(curX <= curY) {
    			round++;
    			break;
    		}
    		
    		curY += y;
    		round++;
    	}
    	
    	System.out.println(round);
    	sc.close();
    }
}