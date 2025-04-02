import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int result = sc.nextInt();
    	
    	while(true) {
    		String temp = sc.next();
    		
    		if(temp.equals("=")) break;
    		
    		if(temp.equals("+")) {
    			result += sc.nextInt();
    		}
    		else if(temp.equals("-")) {
    			result -= sc.nextInt();
    		}
    		else if(temp.equals("*")) {
    			result *= sc.nextInt();
    		}
    		else if(temp.equals("/")) {
    			result /= sc.nextInt();
    		}
    	}
    	
    	System.out.println(result);
    	 
    	sc.close();
    }
}