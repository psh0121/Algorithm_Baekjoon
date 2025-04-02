import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	// N: 금바구니 개수
    	// w: 금화무게 
    	// d: 한바구니에만 w-d 금화가 있음. 
    	while(true) {
    		int N = sc.nextInt();
    		int w = sc.nextInt();
    		int d = sc.nextInt();
    		int pickGold = sc.nextInt();
    		
    		int totalWeight = w * ((N-1) * N / 2);
    		int result = (totalWeight - pickGold) / d;
    		
    		System.out.println(result == 0 ? N : result);
    		
    		if(!sc.hasNext()) break;
    	}
    	
    	sc.close();
    }
}