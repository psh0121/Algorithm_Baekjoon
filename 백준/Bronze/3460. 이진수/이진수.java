import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++) {
        	String value = Integer.toBinaryString(sc.nextInt());
        	
        	for(int j = value.length()-1; j >= 0; j--) {
        		if(value.charAt(j) == '1') System.out.print(Math.abs(value.length() - 1 - j) + " ");
        	}
        }
    }
}