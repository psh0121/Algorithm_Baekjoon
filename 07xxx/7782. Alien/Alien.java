import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int b1 = sc.nextInt();
    	int b2 = sc.nextInt();
    	
    	for(int i = 0; i < n; i++) {
    		int lx = sc.nextInt();
    		int ly = sc.nextInt();
    		int hx = sc.nextInt();
    		int hy = sc.nextInt();
    		
    		if(b1 >= lx && b1 <= hx && b2 >= ly && b2 <= hy) {
    			System.out.println("Yes");
    			return;
    		}
    	}
    	System.out.println("No");
    	sc.close();
    }
}