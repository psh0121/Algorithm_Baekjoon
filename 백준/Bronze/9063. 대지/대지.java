import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	if(n <= 1) {
    		System.out.println(0);
    		return;
    	}
    	
    	int minx = Integer.MAX_VALUE;
    	int maxx = Integer.MIN_VALUE;
    	int miny = Integer.MAX_VALUE;
    	int maxy = Integer.MIN_VALUE;
    	
    	for(int i = 0; i < n; i++) {
    		int x = sc.nextInt();
    		int y = sc.nextInt();
    		
    		minx = Math.min(minx, x);
    		maxx = Math.max(maxx, x);
    		miny = Math.min(miny, y);
    		maxy = Math.max(maxy, y);
    	}
    	
    	System.out.println((maxx - minx) * (maxy - miny));
    }
}