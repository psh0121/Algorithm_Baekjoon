import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String world = sc.next();
    	int cnt = 0;
    	
    	while(sc.hasNext()) {
    		String temp = sc.next();
    		if(temp.contains(world)) cnt++;
    	}
    	
    	System.out.println(cnt);
    	
    	sc.close();
    }
}