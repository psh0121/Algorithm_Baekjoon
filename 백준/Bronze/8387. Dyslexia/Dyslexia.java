import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int cnt = 0;
    	
    	String str1 = sc.next();
    	String str2 = sc.next();
    	
    	for(int i = 0; i < n; i++) {
    		if(str1.charAt(i) == str2.charAt(i)) cnt++;
    	}
    	
    	System.out.println(cnt);
    	
    	sc.close();
    }
}