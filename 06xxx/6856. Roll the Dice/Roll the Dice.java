import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	
    	int cnt = 0;
    	
    	for(int i = 1; i <= Math.min(n, 10); i++) {
    		int j = 10-i;
    		
    		if(j <= m && j > 0) cnt++;
    	}
    	
    	if(cnt == 1) System.out.println("There is " + cnt + " way to get the sum 10.");
    	else System.out.println("There are " + cnt + " ways to get the sum 10.");
    	
    	sc.close();
    }
}