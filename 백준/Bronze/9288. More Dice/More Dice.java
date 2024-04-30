import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 1; i <= n; i++) {
    		int num = sc.nextInt();
    		System.out.println("Case " + i + ":");
    		
    		for(int a = 1; a <= 6; a++) {
    			int b = num - a;
    			
    			if(b > 6) continue;
    			else if(a > b) break;
    			else {
    				System.out.println("(" + a + "," + b + ")");
    			}
    		}
    	}
    	
    	sc.close();
    }
}