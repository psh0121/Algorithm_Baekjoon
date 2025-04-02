import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        while(true) {
        	String s1 = sc.next();
        	String s2 = sc.next();
        	
        	if(s1.equals("0") && s2.equals("0")) break;
        	
        	if(s1.length() < s2.length()) s1 = "0".repeat(s2.length() - s1.length()) + s1;
        	else s2 = "0".repeat(s1.length() - s2.length()) + s2;
        	
        	int[] num1 = new int[s1.length()];
        	int[] num2 = new int[s2.length()];
        	
        	for(int i = 0; i < s1.length(); i++) {
        		num1[i] = Integer.parseInt(Character.toString(s1.charAt(i)));
        		num2[i] = Integer.parseInt(Character.toString(s2.charAt(i)));
        	}
        	
        	int cnt = 0;
        	
        	for(int i = num1.length - 1; i >= 0; i--) {
        		int sum = num1[i] + num2[i];
        		
        		if(sum >= 10) {
        			cnt++;
        			
        			if(i != 0) {
        				num1[i-1] = num1[i-1] + (sum / 10);
        			}
        		}
        	}
        	
        	System.out.println(cnt);
        }
    }
}