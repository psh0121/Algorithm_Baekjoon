import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] register = new String[n];
        for(int i = 0; i < n; i++) register[i] = sc.next();
        
        String value = sc.next();
        
        int cnt = 0;
        
        for(int i = 0; i < n; i++) {
        	if(register[i].equals(value)) cnt++;
        }
        
        System.out.println(cnt);
    }
}