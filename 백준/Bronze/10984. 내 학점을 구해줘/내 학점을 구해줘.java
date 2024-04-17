import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = Integer.valueOf(sc.nextLine());
    	
    	for(int i = 0; i < n; i++) {
    		int m = sc.nextInt();
    		
    		int totalC = 0;
    		double totalG = 0.0;
    		
    		for(int j = 0; j < m; j++) {
    			int c = sc.nextInt();
    			totalC += c;
    			totalG += sc.nextDouble() * c;
    		}
    		
    		System.out.print(totalC + " ");
    		System.out.printf("%.1f", totalG / totalC);
    		System.out.println();
    	}
    	
    	sc.close();
    }
}