import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	while(sc.hasNext()) {
    		double d = sc.nextDouble();
    		double rH = sc.nextDouble();
    		double rV = sc.nextDouble();
    		
    		if(d == 0 && rH == 0 && rV == 0) break;
    		
    		double w = (double)(16 * d) / Math.sqrt(337);
    		double h = (double)9 / 16 * w;
    		
    		double dpiH = rH / w;
    		double dpiV = rV / h;
    		
    		System.out.print("Horizontal DPI: ");
    		System.out.printf("%.2f", dpiH);
    		System.out.println();
    		
    		System.out.print("Vertical DPI: ");
    		System.out.printf("%.2f", dpiV);
    		System.out.println();
    	}
    	
    	sc.close();
    }
}