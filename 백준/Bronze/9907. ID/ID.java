import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String str = sc.next();
    	int sum = 0;
    	
    	for(int i = 0; i < 7; i++) {
    		int n = Integer.valueOf(Character.toString(str.charAt(i)));
    		
    		// 가중치를 곱하고 더해준다.
    		if(i+1 == 1 || i+1 == 7) sum += n*2;
    		else if(i+1 == 2) sum += n*7;
    		else if(i+1 == 3) sum += n*6;
    		else if(i+1 == 4) sum += n*5;
    		else if(i+1 == 5) sum += n*4;
    		else if(i+1 == 6) sum += n*3;
    	}
    	
    	// 11로 나눈 나머지 
    	int divide11 = sum % 11;
    	
    	String result = "";
    	
    	switch(divide11) {
    	case 0:
    		result = "J";
    		break;
    	case 1:
    		result = "A";
    		break;
    	case 2:
    		result = "B";
    		break;	
    	case 3:
    		result = "C";
    		break;
    	case 4:
    		result = "D";
    		break;
    	case 5:
    		result = "E";
    		break;
    	case 6:
    		result = "F";
    		break;
    	case 7:
    		result = "G";
    		break;
    	case 8:
    		result = "H";
    		break;
    	case 9:
    		result = "I";
    		break;
    	case 10:
    		result = "Z";
    		break;
    	default:
    		break;
    	}
    	
    	System.out.println(result);
    	
    	
    	sc.close();
    }
}