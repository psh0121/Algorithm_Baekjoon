import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	int insideSpace = 1;
    	
    	for(int i = 1; i <= n; i++) {
    		if(i == 1) System.out.println(" ".repeat(n-i) + "*");
    		else if(i == n) System.out.println("*".repeat(2*n-1));
    		else {
    			System.out.println(" ".repeat(n-i) + "*" + " ".repeat(insideSpace) + "*");
    			insideSpace += 2;
    		}
    	}
    	
    	sc.close();
    }
}