import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = Integer.parseInt(sc.nextLine());	// testcase
    	
    	for(int i = 1; i <= t; i++) {
    		String expression = sc.nextLine();
    		boolean plusFlag = false;
    		String result = "NO";
    		
    		// 더하기 포함시 plusFlag true 
    		if(expression.contains("+")) plusFlag = true;
    		
    		String[] expressionArr = expression.split(" ");
    		int v1 = Integer.parseInt(expressionArr[0]);
    		int v2 = Integer.parseInt(expressionArr[2]);
    		int v3 = Integer.parseInt(expressionArr[4]);
    		
    		if(plusFlag == true) {
    			if(v1 + v2 == v3) result = "YES";
    		}
    		else {
    			if(v1 - v2 == v3) result = "YES";
    		}
    		
    		System.out.printf("Case %d: %s\n", i, result);
    	}
    	
    	sc.close();
    }
}