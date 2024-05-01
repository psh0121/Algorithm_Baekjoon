import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	while(sc.hasNext()) {
    		int n = sc.nextInt();
    		
    		if(n == 0) break;
    		
    		int a1 = sc.nextInt();
    		int a2 = sc.nextInt();
    		int a3 = sc.nextInt();
    		
    		if(a2 - a1 == a3 - a2) {
    			System.out.println(n * ((2 * a1) + ((n-1) * (a2-a1)))/ 2);
    		}
    		else {
    			System.out.println(a1 * ((int)(Math.pow(a2/a1, n) - 1)) / (a2/a1 - 1));
    		}
    	}
    	
    	sc.close();
    }
}