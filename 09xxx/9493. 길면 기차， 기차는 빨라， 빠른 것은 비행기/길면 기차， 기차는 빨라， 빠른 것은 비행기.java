import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	
    	while(sc.hasNext()) {
    		int m = sc.nextInt();
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		
    		if(m == 0 && a == 0 && b == 0) break;
    		
    		double aTime = (double)m/a;
    		double bTime = (double)m/b;
    		
    		double calValue;
    		
    		if(aTime > bTime) calValue = aTime-bTime;
    		else calValue = bTime-aTime;
    		
    		int hour = (int) (calValue);
    		int min = (int) ((calValue - hour) * 60);
    		int sec = (int) Math.round(((((calValue - hour) * 60) - min) * 60));
    		
    		System.out.print(hour + ":");
    		System.out.print(min < 10 ? "0" + min + ":" : min + ":");
    		System.out.println(sec < 10 ? "0" + sec : sec);
    	}
    	sc.close();
    }
}