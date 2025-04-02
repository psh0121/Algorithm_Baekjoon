import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int aAttack = sc.nextInt();
    	int aHP = sc.nextInt();
    	int bAttack = sc.nextInt();
    	int bHP = sc.nextInt();
    	
    	while(true) {
    		if(aHP <= 0 || bHP <= 0) break;
    		
    		aHP -= bAttack;
    		bHP -= aAttack;
    	}
    	
    	if(aHP > 0) System.out.println("PLAYER A");
    	else if(bHP > 0) System.out.println("PLAYER B");
    	else System.out.println("DRAW");
    	sc.close();
    }
}