import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String[] arr1 = sc.next().split(":");
    	String[] arr2 = sc.next().split(":");
    	
    	int[] numArr1 = new int[3];
    	int[] numArr2 = new int[3];
    	
    	for(int i = 0; i < 3; i++) {
    		numArr1[i] = Integer.parseInt(arr1[i]);
    		numArr2[i] = Integer.parseInt(arr2[i]);
    	}
    	
    	// 예외
    	if(numArr1[0] == numArr2[0] && numArr1[1] == numArr2[1] && numArr1[2] == numArr2[2]) {
    		System.out.println("24:00:00");
    		return;
    	}
    	
    	int hh = 0;
    	int mm = 0;
    	int ss = 0;
    	
    	ss = numArr2[2] - numArr1[2];
    	if(ss < 0) {
    		ss += 60;
    		mm--;
    	}
    	
    	mm += numArr2[1] - numArr1[1];
    	if(mm < 0) {
    		mm += 60;
    		hh--;
    	}
    	
    	hh += numArr2[0] - numArr1[0];
    	if(hh < 0) hh += 24;
    	
    	System.out.printf("%02d:%02d:%02d", hh, mm, ss);
    	
    	sc.close();
    }
}