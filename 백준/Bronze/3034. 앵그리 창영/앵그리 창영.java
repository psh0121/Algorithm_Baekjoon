import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double d = Math.sqrt(w*w + h*h);
        
        double maxNum = Math.max(Math.max(w, h), d);
        
        for(int i = 0; i < n; i++) {
        	if(sc.nextInt() > maxNum) System.out.println("NE");
        	else System.out.println("DA");
        }
    }
}