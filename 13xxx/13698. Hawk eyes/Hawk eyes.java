import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String[] cup = {"ball", "0", "0", "BALL"};
    	
    	String mix = sc.next();
    	
    	for(int i = 0; i < mix.length(); i++) {
    		char turn = mix.charAt(i);
    		String temp;	// 임시 저장공간 
    		
    		if(turn == 'A') {
    			temp = cup[0];
    			cup[0] = cup[1];
    			cup[1] = temp;
    		}
    		else if(turn == 'B') {
    			temp = cup[0];
    			cup[0] = cup[2];
    			cup[2] = temp;
    		}
    		else if(turn == 'C') {
    			temp = cup[0];
    			cup[0] = cup[3];
    			cup[3] = temp;
    		}
    		else if(turn == 'D') {
    			temp = cup[1];
    			cup[1] = cup[2];
    			cup[2] = temp;
    		}
    		else if(turn == 'E') {
    			temp = cup[1];
    			cup[1] = cup[3];
    			cup[3] = temp;
    		}
    		else {
    			temp = cup[2];
    			cup[2] = cup[3];
    			cup[3] = temp;
    		}
    	}
    	
    	int small = 0;
		int big = 0;
		
		for(int j = 0; j < cup.length; j++) {
			if(cup[j].equals("ball")) small = j+1;
			else if(cup[j].equals("BALL")) big = j+1;
		}
		
		System.out.printf("%d\n%d", small, big);
    	
    	sc.close();
    }
}