import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if(num == 0) {
        	System.out.println(1);
        	return;
        }
        
        if(num == 1) {
        	System.out.println(0);
        	return;
        }
        
        if(num % 2 == 0) {
        	System.out.println("8".repeat(num / 2));
        	return;
        }
        System.out.println("4" + "8".repeat(num / 2));
    }
}

// 0 : 구멍 타원모양
// 4,6,9 : 구멍 하나
// 8 : 외접한 구멍 2개 
// 1,2,3,5,7 : 종이 자르기 