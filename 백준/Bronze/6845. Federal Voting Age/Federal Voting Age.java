import java.util.Scanner;

public class Main {
	
	public static boolean isCanVote(int year, int month, int day) {
		boolean result = true;
		
		// 18세 미만 
		if(year > 1989 || (year == 1989 && month > 2) || (year == 1989 && month == 2 && day > 27)) result = false;
		
		return result;
	}
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 0; i < n; i++) {
    		int year = sc.nextInt();
    		int month = sc.nextInt();
    		int day = sc.nextInt();
    		
    		if(isCanVote(year, month, day)) System.out.println("Yes");
    		else System.out.println("No");
    	}
    	
    	sc.close();
    }
}