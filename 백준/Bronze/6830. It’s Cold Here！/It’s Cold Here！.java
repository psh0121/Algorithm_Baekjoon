import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	String city = "";
    	int temp = Integer.MAX_VALUE;
    	
    	while(sc.hasNext()) {
    		String boxCity = sc.next();
    		int boxTemp = sc.nextInt();
    		
    		if(boxTemp < temp) {
    			city = boxCity;
    			temp = boxTemp;
    		}
    	}
    	
    	System.out.println(city);
    	
    	sc.close();
    }
}