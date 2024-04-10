import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	String alpha = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
    	int n = sc.nextInt();
    	
    	for(int i = 1; i <= n; i++) {
    		String str = sc.next();
    		String nextStr = "";
    		
    		for(int j = 0; j < str.length(); j++) {
    			String s = Character.toString(str.charAt(j));
    			int nextIdx = (alpha.indexOf(s)+1) % alpha.length();
    			
    			nextStr += alpha.charAt(nextIdx);
    		}
    		
    		System.out.println("String #" + i);
    		System.out.println(nextStr);
    		System.out.println();
    	}
    	
    	sc.close();
    }
}