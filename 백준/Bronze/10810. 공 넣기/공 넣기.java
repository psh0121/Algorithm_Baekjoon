import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();	// 바구니 개수 
    	int m = sc.nextInt();	// 바구니 공넣을 횟수 
    	
    	int[] bucket = new int[n + 1];
    	
    	for(int i = 0; i < m; i++) {
    		int a = sc.nextInt();	// 시작바구니 
    		int b = sc.nextInt();	// 끝바구니 
    		int c = sc.nextInt();	// 공번호 
    		
    		for(int j = a; j <= b; j++) {
    			bucket[j] = c;
    		}
    	}
    	
    	// 최종 바구니 결과 
    	for(int i = 1; i < bucket.length; i++) {
    		System.out.print(bucket[i] + " ");
    	}
    	
    	
    	sc.close();
    }
}