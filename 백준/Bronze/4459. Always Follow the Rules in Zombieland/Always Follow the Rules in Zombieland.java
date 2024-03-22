import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = Integer.valueOf(sc.nextLine());
    	String[] rule = new String[n+1];
    	
    	for(int i = 1; i <= n; i++) {
    		rule[i] = sc.nextLine();
    	}
    	
    	int m = Integer.valueOf(sc.nextLine());
    	
    	for(int i = 0; i < m; i++) {
    		int num = Integer.valueOf(sc.nextLine());
    		
    		if(num > 0 && num <= n) {
    			System.out.println("Rule " + num + ": " + rule[num]);
    		}
    		else {
    			System.out.println("Rule " + num + ": No such rule");
    		}
    	}
    	sc.close();
    }
}