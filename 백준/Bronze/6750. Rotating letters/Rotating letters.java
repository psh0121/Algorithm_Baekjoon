import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	String str = sc.next();
    	
    	String compareStr = "IOSHZXN";
    	
    	for(int i = 0; i < str.length(); i++) {
    		if(!compareStr.contains(Character.toString(str.charAt(i)))) {
    			System.out.println("NO");
    			return;
    		}
    	}
    	
    	System.out.println("YES");
    	sc.close();
    }
}