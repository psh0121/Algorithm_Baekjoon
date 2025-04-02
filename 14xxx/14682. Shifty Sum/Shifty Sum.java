import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int k = sc.nextInt();
    	long num = n;
    	long result = n;
    	
    	for(int i = 1; i <= k; i++) {
    		num *= 10;
    		result += num;
    	}
    	
    	System.out.println(result);
    	
    	sc.close();
    }
}