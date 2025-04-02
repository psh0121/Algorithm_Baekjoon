import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	
    	for(int i = 0; i < t; i++) {
    		int d = sc.nextInt();	// 수업시간
    		
    		int value = 0;
    		
    		for(int c = 1; c <= Math.sqrt(d); c++) {
    			if(c * (c + 1) > d) break;
    			else value++;
    		}
    		
    		System.out.println(value);
    	}
    	
    	sc.close();
    }
}