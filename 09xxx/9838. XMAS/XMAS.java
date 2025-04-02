import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	int[] arr = new int[t];
    	
    	// 배열안에 값 넣기 
    	for(int i = 0; i < t; i++) {
    		arr[i] = sc.nextInt();
    	}
    	
    	// arr를 돌아가며 자기가 준 선물이 어딘지 파악후 출력 
    	for(int i = 0; i < t; i++) {
    		for(int j = 0; j < t; j++) {
    			if(arr[j] == i+1) {
    				System.out.println(j+1);
    				break;
    			}
    		}
    	}
    	
    	sc.close();
    }
}