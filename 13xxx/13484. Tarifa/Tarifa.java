import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int mb = sc.nextInt();
    	int n = sc.nextInt();
    	int totalMB = 0;
    	
    	for(int i = 0; i < n; i++) {
    		totalMB += mb;
    		totalMB -= sc.nextInt();
    	}
    	
    	totalMB += mb;
    	
    	System.out.println(totalMB);
    	sc.close();
    }
}