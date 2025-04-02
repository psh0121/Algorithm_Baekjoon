import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		String gradeStr = sc.nextLine();
    		if(gradeStr.equals("0 0 0 0 0 0")) break;
    		String[] gradeArr = gradeStr.split(" ");
    		int[] grade = new int[6];
    		
    		int sum = 0;
    		for(int i = 0; i < grade.length; i++) {
    			grade[i] = Integer.parseInt(gradeArr[i]);
    			sum += grade[i];
    		}
    		
    		int min = Integer.MAX_VALUE;
    		int max = Integer.MIN_VALUE;
    		
    		for(int i = 0; i < 6; i++) {
    			int num = grade[i];
    			
    			if(num < min) min = num;
    			if(num > max) max = num;
    		}
    		
    		double result = (double)(sum-min-max) / 4;
    		
    		if(result % 1 == 0) System.out.println((int) result);
    		else System.out.println(result);
    	}
    	sc.close();
    }
}