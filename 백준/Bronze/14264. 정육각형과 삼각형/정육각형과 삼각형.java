import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int l = sc.nextInt();
    	
    	double s = Math.sqrt(3) / 4 * l * l;
    	
    	System.out.println(s);
    	
    	sc.close();
    }
}