import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	
    	for(int i = 1; i <= t; i++) {
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		
    		System.out.print("Case " + i + ": ");
    		
    		int ii = a/b;
    		int nn = a%b;
    		int dd = b;
    		
    		if(ii != 0) {
    			if(nn == 0) System.out.println(ii);
    			else System.out.println(ii + " " + nn + "/" + dd);
    		}
    		else {
    			if(nn != 0) {
    				System.out.println(nn + "/" + dd);
    			}
    			else {
    				System.out.println(0);
    			}
    		}
    	}
    	
    	sc.close();
    }
}