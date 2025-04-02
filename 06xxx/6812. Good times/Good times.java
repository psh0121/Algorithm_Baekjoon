import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int time = sc.nextInt();
    	
    	int hh = time / 100;
    	int mm = time % 100;
    	
    	int calHH = 0;
    	int calMM = 0;
    	
    	// Ottawa
    	System.out.println(time + " in Ottawa");
    	
    	// Victoria
    	calMM = mm;
    	calHH = hh - 3;
    	if(calHH < 0) calHH += 24;
    	
    	String calMin = Integer.toString(calMM);
    	String calHour = Integer.toString(calHH);
    	if(calMin.length() == 1) calMin = "0" + calMin;
    	if(calHour.equals("0")) calHour = "";
    	
    	
    	System.out.println(calHour + calMin + " in Victoria");
    	
    	// Edmonton
    	calMM = mm;
    	calHH = hh - 2;
    	if(calHH < 0) calHH += 24;
    	
    	calHour = Integer.toString(calHH);
    	if(calHour.equals("0")) calHour = "";
    	
    	System.out.println(calHour + calMin + " in Edmonton");

    	// Winnipeg
    	calMM = mm;
    	calHH = hh - 1;
    	if(calHH < 0) calHH += 24;
    	
    	calHour = Integer.toString(calHH);
    	if(calHour.equals("0")) calHour = "";
    	
    	System.out.println(calHour + calMin + " in Winnipeg");
    	
    	// Toronto
    	System.out.println(time + " in Toronto");
    	
    	// Halifax
    	calMM = mm;
    	calHH = hh + 1;
    	calHH = calHH % 24;
    	
    	calHour = Integer.toString(calHH);
    	if(calHour.equals("0")) calHour = "";
    	
    	System.out.println(calHour + calMin + " in Halifax");
    	
    	// St. John's
    	calMM = mm + 30;
    	if(calMM >= 60) {
    		calHH = 1;
    		calMM = calMM % 60;
    	}
    	else calHH = 0;
    	
    	calHH = calHH + hh + 1;
    	calHH = calHH % 24;
    	
    	calMin = Integer.toString(calMM);
    	if(calMin.length() == 1) calMin = "0" + calMin;
    	
    	calHour = Integer.toString(calHH);
    	if(calHour.equals("0")) calHour = "";
    	
    	System.out.println(calHour + calMin + " in St. John's");
    	
    	sc.close();
    }
}