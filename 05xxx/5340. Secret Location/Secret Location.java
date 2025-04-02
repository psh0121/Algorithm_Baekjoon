import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int[] latitude = new int[3];
    	int[] longitude = new int[3];
    	
    	for(int i = 0; i < 3; i++) {
    		String str = sc.nextLine();
    		if(str.charAt(str.length() - 1) == ' ') {
    			latitude[i] = str.length() - 1;
    		}
    		else latitude[i] = str.length();
    	}
    	
    	for(int i = 0; i < 3; i++) {
    		String str = sc.nextLine();
    		if(str.charAt(str.length() - 1) == ' ') {
    			longitude[i] = str.length() - 1;
    		}
    		else longitude[i] = str.length();
    	}
 
    	System.out.println("Latitude " + latitude[0] + ":" + latitude[1] + ":" + latitude[2]);
    	System.out.println("Longitude " + longitude[0] + ":" + longitude[1] + ":" + longitude[2]);
    	
    	sc.close();
    }
}