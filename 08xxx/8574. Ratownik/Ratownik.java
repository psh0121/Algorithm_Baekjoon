import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int k = sc.nextInt();
    	int x = sc.nextInt();
    	int y = sc.nextInt();
    	
    	int cnt = 0;
    	
    	for(int i = 0; i < n; i++) {
    		int xi = sc.nextInt();
    		int yi = sc.nextInt();
    		
    		double distance = Math.sqrt(Math.pow(xi - x, 2) + Math.pow(yi - y, 2));
    		
    		if(distance > k) cnt++;
    	}
    	
    	System.out.println(cnt);
    	
    	sc.close();
    }
}