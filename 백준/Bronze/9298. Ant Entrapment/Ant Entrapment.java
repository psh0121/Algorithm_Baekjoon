import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 1; i <= n; i++) {
    		int ant = sc.nextInt();
    		double[] x = new double[ant];
    		double[] y = new double[ant];
    		
    		for(int j = 0; j < ant; j++) {
    			x[j] = sc.nextDouble();
    			y[j] = sc.nextDouble();
    		}
    		
    		Arrays.sort(x);
    		Arrays.sort(y);
    		
    		double lenX = x[ant-1] - x[0];
    		double lenY = y[ant-1] - y[0];
    		
    		System.out.print("Case " + i + ": Area ");
    		System.out.print(lenX*lenY + ", Perimeter ");
    		System.out.println(lenX * 2 + lenY * 2);
    	}
    	
    	sc.close();
    }
}