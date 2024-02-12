import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        for(int i = 0; i < n; i++) {
        	int result = 0;
        	for(int j = 65; j <= 90; j++) result += j;
        	
        	String str = sc.next();
        	
        	for(int k = 0; k < alpha.length(); k++) {
        		if(str.contains(Character.toString(alpha.charAt(k)))) {
        			result -= (int)alpha.charAt(k);
        		}
        	}
        	
        	System.out.println(result);
        }
    }
}