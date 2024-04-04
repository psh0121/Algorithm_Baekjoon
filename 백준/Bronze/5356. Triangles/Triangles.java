import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 0; i < n; i++) {
    		int m = sc.nextInt();
    		String alpha = sc.next();
    		int alphaNum = (int)alpha.charAt(0);
    		
    		for(int j = 1; j <= m; j++) {
    			System.out.println(alpha.repeat(j));
    			alphaNum++;
    			
    			if(alphaNum == 91) alphaNum = 65;
    			
    			alpha = String.valueOf((char)alphaNum);
    		}
    		
    		System.out.println();
    	}
    	
    	sc.close();
    }
}