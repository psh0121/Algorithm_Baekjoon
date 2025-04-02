import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String[] name = {"", "Yakk", "Doh", "Seh", "Ghar", "Bang", "Sheesh"};
    	String[] sameName = {"", "Habb Yakk", "Dobara", "Dousa", "Dorgy", "Dabash", "Dosh"};
    	int t = sc.nextInt();
    	
    	for(int i = 1; i <= t; i++) {
    		int[] piece = {sc.nextInt(), sc.nextInt()};
    		Arrays.sort(piece);
    		
    		String value = "";
    		
    		if(piece[0] == piece[1]) {
    			value = sameName[piece[0]];
    		}
    		else if(piece[0] == 5 && piece[1] == 6) {
    			value = "Sheesh Beesh";
    		}
    		else {
    			value = name[piece[1]] + " " + name[piece[0]];
    		}
    		
    		System.out.printf("Case %d: %s\n", i, value);
    	}
    	
    	sc.close();
    }
}