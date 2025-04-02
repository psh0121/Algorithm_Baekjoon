import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	// 최소 속도 이하, 최소중량 이상, 최소힘 이상
    	// Wide Receiver/ 4.5 / 150 / 200
    	// Lineman/ 6.0 / 300 / 500
    	// Quarterback/ 5.0 / 200 / 300
    	
    	while(true) {
    		double speed = sc.nextDouble();
    		int weight = sc.nextInt();
    		int strength = sc.nextInt();
    		
    		String result = "";
    		
    		if(speed == 0 && weight == 0 && strength == 0) break;
    		
    		if(speed <= 4.5 && weight >= 150 && strength >= 200) {
    			result += "Wide Receiver ";
    		}
    		if(speed <= 6.0 && weight >= 300 && strength >= 500) {
    			result += "Lineman ";
    		}
    		if(speed <= 5.0 && weight >= 200 && strength >= 300) {
    			result += "Quarterback ";
    		}
    		if(result.length() == 0) result += "No positions";
    	    		
    		System.out.println(result);
    	}
    	
    	
    	sc.close();
    }
}