import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		int gameTimes = sc.nextInt();
    		if(gameTimes == 0) break;
    		
    		int m = 0;
    		int j = 0;
    		
    		for(int i = 0; i < gameTimes; i++) {
    			int win = sc.nextInt();
    			
    			if(win == 0) m++;
    			else j++;
    		}
    		
    		System.out.println("Mary won " + m + " times and John won " + j + " times");
    	}
    	sc.close();
    }
}