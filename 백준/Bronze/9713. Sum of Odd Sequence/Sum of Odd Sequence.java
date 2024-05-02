import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	
    	for(int i = 0; i < t; i++) {
    		int num = sc.nextInt();
    		int sum = 0;
    		
    		for(int j = 1; j <= num; j = j + 2) {
    			sum += j;
    		}
    		
    		System.out.println(sum);
    	}
    	
    	sc.close();
    }
}