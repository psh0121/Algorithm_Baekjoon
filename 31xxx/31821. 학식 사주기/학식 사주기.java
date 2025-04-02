import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();	// 메뉴개수
    	int[] menu = new int[n+1];
    	
    	for(int i = 1; i <= n; i++) {
    		menu[i] = sc.nextInt();
    	}
    	
    	int m = sc.nextInt();	// 학생 수 
    	int total = 0;	// 총 가격 
    	
    	for(int i = 0; i < m; i++) {
    		total += menu[sc.nextInt()];
    	}
    	
    	System.out.println(total);
    	sc.close();
    }
}