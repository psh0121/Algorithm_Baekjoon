import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	String str = sc.next();
    	int eCnt = 0;
    	
    	for(int i = 0; i < str.length(); i++) {
    		if(str.charAt(i) == 'e') eCnt++;
    	}
    	
    	System.out.println('h' + "e".repeat(eCnt*2) + 'y');
    	sc.close();
    }
}