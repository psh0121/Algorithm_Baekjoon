import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	String num = sc.next();
    	String result = "";
    	
    	int count = 0;
    	for(int i = num.length()-1; i >= 0; i--) {
    		result = num.charAt(i) + result;
    		count++;
    		
    		if(count == 3 && i != 0) {
    			count = 0;
    			result = "," + result;
    		}
    	}
    	
    	System.out.println(result);
    	
    	sc.close();
    }
}