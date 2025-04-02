import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	String[] item = {"Paper", "Printer", "Planners", 
    			"Binders", "Calendar", "Notebooks", "Ink"
    	};
    	double[] cost = { 57.99, 120.50, 31.25,
    			22.50, 10.95, 11.20, 66.95
    	};
    	
    	double total = 0.0;
    	
    	while(true) {
    		String temp = sc.next();
    		if(temp.equals("EOI")) break;
    		
    		for(int i = 0; i < item.length; i++) {
    			if(temp.equals(item[i])) {
    				total += cost[i];
    				break;
    			}
    		}
    	}
    	
    	System.out.println("$" + total);
    	sc.close();
    }
}