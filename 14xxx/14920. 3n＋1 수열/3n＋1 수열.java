import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int c1 = sc.nextInt();
    	int cn = c1;
    	int n = 1;
    	
    	while(cn != 1) {
    		// 짝수 
    		if(cn % 2 == 0) {
    			cn /= 2;
    		}
    		// 홀수 
    		else {
    			cn = 3 * cn + 1;
    		}
    		
    		n++;
    	}
    	
    	System.out.println(n);
    	
    	sc.close();
    }
}