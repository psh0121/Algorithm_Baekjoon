import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	String str = sc.next();
    	
    	int a = 0;
    	int b = 0;
    	
    	for(int i = 0; i < t; i++) {
    		char s = str.charAt(i);
    		
    		if(s == 'A') a++;
    		else b++;
    	}
    	
    	if(a > b) System.out.println("A");
    	else if(a == b) System.out.println("Tie");
    	else System.out.println("B");
    	
    	sc.close();
    }
}