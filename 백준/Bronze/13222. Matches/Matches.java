import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// cnt
		int w = sc.nextInt();
		int h = sc.nextInt();
		double diagonal = Math.sqrt(w*w + h*h);

		double maxLen = Math.max(w, h);
		maxLen = Math.max(diagonal, maxLen);
		
		for(int i = 0; i < n; i++) {
			int matches = sc.nextInt();

			if(matches <= maxLen) System.out.println("YES");
			else System.out.println("NO");
		}

    	sc.close();
    }
}