import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	String result = "";
    	
    	int beforeLen = 0;
    	
    	for(int i = 0; i < n; i++) {
    		String word = sc.next();
    		
    		if(i == 0) result += word.charAt(i);
    		else {
    			if(word.length() < beforeLen) result += " ";
    			else result += word.charAt(beforeLen - 1);
    		}
    		
    		beforeLen = word.length();
    	}
    	
    	System.out.println(result);
    	sc.close();
    }
}