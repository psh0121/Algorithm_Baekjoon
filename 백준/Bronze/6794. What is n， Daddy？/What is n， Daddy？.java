import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int value = sc.nextInt();
    	int result = 0;
    	
    	int l = 0;
    	int r = 0;
    	
    	while(l <= 5 && r <= 5) {
    		if(l+r == value && l >= r) {
    			result++;
    			r++;
    			l = 0;
    		}
    		
    		if(l == 5) r++;
    		else l++;
    	}
    	
    	System.out.println(result);
    	
    	sc.close();
    }
}