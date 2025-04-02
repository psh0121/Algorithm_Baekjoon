import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int candy = sc.nextInt();
    	int result = 0;
    	
    	for(int young = 1; young <= candy; young++) {
    		for(int nam = 1; nam <= candy; nam++) {
    			for(int taek = 1; taek <= candy; taek++) {
    				if(young + nam + taek == candy) {
    					if(nam >= young + 2 && taek % 2 == 0) result++;
    				}
    			}
    		}
    	}
    	
    	System.out.println(result);
    	sc.close();
    }
}