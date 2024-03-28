import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine();
    	String result = String.valueOf(str.charAt(0));
    	
    	for(int i = 1; i < str.length(); i++) {
    		if(str.charAt(i - 1) == str.charAt(i)) continue;
    		else {
    			result += str.charAt(i);
    		}
    	}
    	
    	System.out.println(result);
    	
    	sc.close();
    }
}