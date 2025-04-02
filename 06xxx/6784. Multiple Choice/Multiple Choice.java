import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	String[] st = new String[n];
    	String[] te = new String[n];
    	
    	for(int i = 0; i < n; i++) st[i] = sc.next();
    	for(int i = 0; i < n; i++) te[i] = sc.next();
    	
    	int cnt = 0;
    	
    	for(int i = 0; i < n; i++) {
    		if(st[i].equals(te[i])) cnt++;
    	}
    	
    	System.out.println(cnt);
    	
    	sc.close();
    }
}