import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();	// 마법거울 크기 
    	String[] mirror = new String[n];	// 마법거울 
    	
    	for(int i = 0; i < n; i++) {
    		mirror[i] = sc.next();
    	}
    	
    	int state = sc.nextInt();	// 마법거울 심리상태 
    	
    	if(state == 1) {	// 그대로 
    		for(int i = 0; i < mirror.length; i++) {
    			System.out.println(mirror[i]);
    		}
    	}
    	else if(state == 2) {	// 좌우반전 
    		for(int i = 0; i < mirror.length; i++) {
    			String origin = mirror[i];
    			String reversed = new StringBuilder(origin).reverse().toString();
    			
    			System.out.println(reversed);
    		}
    	}
    	else {	// 상하반전 
    		for(int i = mirror.length - 1; i >= 0; i--) {
    			System.out.println(mirror[i]);
    		}
    	}
    	
    	sc.close();
    }
}