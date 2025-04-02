
public class Main {
	
    public static void main(String[] args){
    	int oneHundredEleven = 111;
    	
    	for(int top = 100; top <= 999; top++) {
    		for(int bottom = 100; bottom <= 999; bottom++) {
    			if(top % oneHundredEleven == 0 && bottom % oneHundredEleven == 0) continue;
    			if((top / 10) * bottom == top * (bottom % 100) && (top % 10) == (bottom/100)) {
    				System.out.println(top + " / " + bottom + " = " + top/10 + " / " + bottom%100);
    			}
    		}
    	}
    }
}