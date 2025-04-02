//import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	//Scanner sc = new Scanner(System.in);
    	//sc.close();
    	
    	for(int a = 2; a <= 100; a++) {
    		
    		for(int b = 2; b <= 100; b++) {
    			if(Math.pow(a, 3) <= Math.pow(b, 3)) break;
    			
    			for(int c = b+1; c <= 100; c++) {
    				if(Math.pow(a, 3) <= Math.pow(b, 3) + Math.pow(c, 3)) break;
    				
    				for(int d = c+1; d <= 100; d++) {
    					if(Math.pow(a, 3) == Math.pow(b, 3) + Math.pow(c, 3) + Math.pow(d, 3)) {
    						System.out.println("Cube = " + a + ", Triple = (" + b + "," + c + "," + d + ")");
    						break;
    					}
    					else if(Math.pow(a, 3) < Math.pow(b, 3) + Math.pow(c, 3) + Math.pow(d, 3)) break;
    				}
    			}
    		}
    	}
    }
}