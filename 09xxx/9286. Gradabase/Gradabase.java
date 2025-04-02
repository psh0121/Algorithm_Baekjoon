import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 1; i <= n; i++) {
    		System.out.println("Case " + i + ":");
    		int cnt = sc.nextInt();
    		
    		for(int j = 0; j < cnt; j++) {
    			int grade = sc.nextInt() + 1;
    			
    			if(grade <= 6) System.out.println(grade);
    		}
    	}
    	
    	sc.close();
    }
}