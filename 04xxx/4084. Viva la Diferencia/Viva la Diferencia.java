import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        while(true) {
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	int c = sc.nextInt();
        	int d = sc.nextInt();
        	
        	int tempA = a;
        	
        	int cnt = 0;
        	
        	if(a == 0 && b == 0 && c == 0 & d == 0) break;
        	
        	while(true) {
        		if(a == b && b == c && c == d) break;
        		
        		tempA = a;
        		a = Math.abs(a-b);
        		b = Math.abs(b-c);
        		c = Math.abs(c-d);
        		d = Math.abs(d-tempA);
        		
        		cnt++;
        	}
        	
        	System.out.println(cnt);
        }
    }
}