import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 0; i < n; i++) {
    		double[] aArr = {sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};
    		double[] gArr = {sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};
    		
    		double a = aArr[0] * gArr[1] + aArr[1] * gArr[2] + aArr[2] * gArr[0];
    		double g = gArr[0] * aArr[1] + gArr[1] * aArr[2] + gArr[2] * aArr[0];
    		
    		if(a > g) System.out.println("ADAM");
    		else if(a == g) System.out.println("=");
    		else System.out.println("GOSIA");
    	}
    	
    	sc.close();
    }
}