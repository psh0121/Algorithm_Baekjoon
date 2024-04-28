import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 0; i < n; i++) {
    		int m = sc.nextInt();
    		String str = sc.next();
    		
    		int ee = 0;
    		int ww = 0;
    		int ss = 0;
    		int nn = 0;
    		
    		for(int j = 0; j < m; j++) {
    			char c = str.charAt(j);
    			
    			if(c == 'E') ee++;
    			else if(c == 'W') ww++;
    			else if(c == 'S') ss++;
    			else nn++;
    		}
    		
    		System.out.println(Math.abs(ee-ww) + Math.abs(nn-ss));
    	}
    	
    	sc.close();
    }
}