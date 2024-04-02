import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		String[] parts = sc.nextLine().split(" ");
    		if(parts[0].equals("00:00") && parts[1].equals("00:00")) break;
    		
    		// 시간 숫자형으로 배열에 담기 
    		int[] timeArr = new int[parts.length * 2];
    		for(int i = 0; i < parts.length; i++) {
    			String[] timeParts = parts[i].split(":");
    			timeArr[i * 2] = Integer.parseInt(timeParts[0]);
    			timeArr[i * 2 + 1] = Integer.parseInt(timeParts[1]);
    		}
    		
    		int d = 0;
    		int h = timeArr[0] + timeArr[2];
    		int m = timeArr[1] + timeArr[3];
    		
    		h = h + (m / 60);
    		m = m % 60;
    		
    		d = d + (h / 24);
    		h = h % 24;
    		
    		String sh, sm;
    		
    		if(h / 10 == 0) sh = "0" + h;
    		else sh = Integer.toString(h);
    		
    		if(m / 10 == 0) sm = "0" + m;
    		else sm = Integer.toString(m);
    		
    		if(d == 0) System.out.println(sh + ":" + sm);
    		else System.out.println(sh + ":" + sm + " +" + d);
    	}
    	sc.close();
    }
}