import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	
    	for(int i = 0; i < t; i++) {
    		int n = sc.nextInt();	// 쿠키개수 
    		int c = sc.nextInt();	// 먹는개수 
    		
    		int day = 0;	// 몇일동안 먹을 수 있는가 
    		
    		while(n > 0) {
    			n = n - c;
    			day++;
    		}
    		
    		System.out.println(day);
    	}
    	
    	sc.close();
    }
}