import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
        
    	int n = sc.nextInt();
    	int[] arr = new int[n];
    	
    	for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
    	
    	int m = sc.nextInt();	// 작업 개수
    	
    	for(int i = 0; i < m; i++) {
    		int k = sc.nextInt();	// 작업 종류
    		int l = sc.nextInt();	// 구간의 왼쪽 끝 
    		int r = sc.nextInt();	// 구간의 오른쪽 
    		
    		if(k == 1) {
    			// 구간 [l,r]에 대해 arr[i]^2 mod 2010 수행
    			for(int j = l - 1; j <= r - 1; j++) {
    				arr[j] = (int)(((long) arr[j] * arr[j]) % 2010);
    			}
    		}
    		else {	// k == 2
    			// 구간 [l,r]에 대해 arr의 합계 출력 
    			int sum = 0;
    			for(int j = l - 1; j <= r - 1; j++) {
    				sum += arr[j];
    			}
    			
    			// print
    			System.out.println(sum);
    		}
    	}
    	
    	sc.close();
    }
}