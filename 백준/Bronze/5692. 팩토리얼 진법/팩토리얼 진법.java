import java.util.Scanner;

public class Main {
	
	public static int factorial(int num) {
		if(num == 1) return num;
		
		return num * factorial(num-1);
	}
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		String str = sc.next();
    		if(str.equals("0")) break;
    		
    		int result = 0;
    		
    		for(int i = 0; i < str.length(); i++) {
    			result += Character.getNumericValue(str.charAt(i)) * factorial(str.length() - i);
    		}
    		
    		System.out.println(result);
    	}
    	sc.close();
    }
}