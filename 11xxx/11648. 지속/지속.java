import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String[] arr = sc.next().split("");
    	int result = 0;
    	
    	while(arr.length > 1) {
    		int num = 1;
    		
    		for(int i = 0; i < arr.length; i++) {
    			num *= Integer.parseInt(arr[i]);
    		}
    		
    		arr = Integer.toString(num).split("");
    		
    		result++;
    	}
    	
    	System.out.println(result);
    	
    	sc.close();
    }
}