import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		String n = sc.next();
    		if(n.equals("0")) break;
    		
    		int num = 0;
    		
    		while(n.length() != 1) {
    			num = 0;
    			
    			for(int i = 0; i < n.length(); i++) {
    				num += Character.getNumericValue(n.charAt(i));
    			}
    			
    			n = Integer.toString(num);
    		}
    		
    		System.out.println(n);
    	}
    	
    	
    	sc.close();
    }
}