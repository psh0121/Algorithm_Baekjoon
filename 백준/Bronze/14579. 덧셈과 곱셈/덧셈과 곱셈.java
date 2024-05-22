import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int start = sc.nextInt();
    	int end = sc.nextInt();
    	
    	int beforeSum = 0;	// 1부터 특정 수까지의 합 
    	beforeSum = (start - 1) * start / 2;
    	
    	long result = 1;
    	
    	for(int i = start; i <= end; i++) {
    		beforeSum += i;
    		result *= beforeSum;
    		result %= 14579;
    	}
    	
    	System.out.println(result);
    	sc.close();
    }
}