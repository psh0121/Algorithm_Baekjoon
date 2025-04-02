import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	String pw = sc.next();
    	
    	int n = sc.nextInt();
    	
    	for(int i = 0; i < n; i++) {
    		int a = 0;
    		int b = 0;
    		
    		String value = sc.next();
    		
    		// 같은 숫자가 포함되어 있는가? 
    		// 같은 숫자가 같은 위치에 있는가? 
    		for(int j = 0; j < 4; j++) {
    			char v = value.charAt(j);
    			
    			if(pw.contains(Character.toString(v))) a++;
    			if(pw.charAt(j) == v) b++;
    		}
    		
    		System.out.println(a + " " + b);
    	}
    	
    	sc.close();
    }
}