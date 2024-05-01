import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 1; i <= n; i++) {
    		System.out.print("Case " + i + ": ");
    		int x = sc.nextInt();
    		System.out.print(x-1 + " ");
    		
    		int xNum = x;
    		
    		for(int j = 0; j < x; j++) {
    			System.out.print((sc.nextInt() * xNum) + " ");
    			xNum--;
    		}
    		sc.nextInt();
    		
    		System.out.println();
    	}
    	
    	sc.close();
    }
}