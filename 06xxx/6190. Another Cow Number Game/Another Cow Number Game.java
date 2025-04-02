import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	long n = sc.nextLong();
    	long nextValue = n;
    	int score = 0;
    	
    	while(nextValue != 1) {
    		if(nextValue % 2 == 1) nextValue = nextValue * 3 + 1;
    		else nextValue = nextValue / 2;
    		
    		score++;
    	}
    	
    	System.out.println(score);
    	
    	sc.close();
    }
}