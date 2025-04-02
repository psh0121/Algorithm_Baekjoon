import java.util.Scanner;

public class Main {
	
	public static String droughtValue(int e, int a) {
		if(e <= a) return "no drought";
		String drought = "drought";
		String mega = "";
		
		for(int i = a*5; i < e; i *= 5) mega += "mega ";
		
		return mega + drought;
	}
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 1; i <= n; i++) {
    		int e = sc.nextInt();
    		int a = sc.nextInt();
    		System.out.println("Data Set " + i + ":");
    		System.out.println(droughtValue(e, a));
    		System.out.println();
    	}
    	
    	sc.close();
    }
}