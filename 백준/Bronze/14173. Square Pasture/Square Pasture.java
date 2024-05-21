import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int minX = Integer.MAX_VALUE;
    	int maxX = Integer.MIN_VALUE;
    	int minY = Integer.MAX_VALUE;
    	int maxY = Integer.MIN_VALUE;
    	
    	for(int i = 0; i < 4; i++) {
    		int x = sc.nextInt();
    		int y = sc.nextInt();
    		
    		minX = Math.min(minX, x);
    		maxX = Math.max(maxX, x);
    		minY = Math.min(minY, y);
    		maxY = Math.max(maxY, y);
    	}
    	
    	System.out.println((int)Math.pow(Math.max(maxX - minX, maxY - minY), 2));
    	sc.close();
    }
}