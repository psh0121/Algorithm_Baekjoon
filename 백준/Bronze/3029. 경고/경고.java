import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        String[] arr1 = sc.next().split(":");
        String[] arr2 = sc.next().split(":");
        
        int[] curTime = new int[arr1.length];
        int[] throwTime = new int[arr2.length];
        
        for(int i = 0; i < 3; i++) {
        	curTime[i] = Integer.parseInt(arr1[i]);
        	throwTime[i] = Integer.parseInt(arr2[i]);
        }
        
        String[] resultTime = new String[3];
        
        // arr[0] - 시, arr[1] - 분, arr[2] - 초 
        if(throwTime[2] < curTime[2]) {
        	throwTime[1]--;
        	throwTime[2] += 60; 
        }
        
        int sec = throwTime[2] - curTime[2];
    	resultTime[2] = Integer.toString(sec).length() == 1 ? "0" + sec : "" + sec;
        
        if(throwTime[1] < curTime[1]) {
        	throwTime[0]--;
        	throwTime[1] += 60; 
        }
        
        int min = throwTime[1] - curTime[1];
    	resultTime[1] = Integer.toString(min).length() == 1 ? "0" + min : "" + min;
    	
    	if(throwTime[0] < curTime[0]) {
    		throwTime[0] += 24;
    	}
    	
    	int hour = (throwTime[0] - curTime[0]) % 24;
    	resultTime[0] = Integer.toString(hour).length() == 1 ? "0" + hour : "" + hour;
    	
    	if(resultTime[0].equals("00") && resultTime[1].equals("00") && resultTime[2].equals("00")) {
    		resultTime[0] = "24";
    	}
    	
    	System.out.println(String.join(":", resultTime));
    }
}