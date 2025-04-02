import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int p = sc.nextInt();
    	int q = sc.nextInt();
    	
    	int[] pArr = new int[p];
    	int[] qArr = new int[q];
    	
    	int pidx = 0;
    	for(int i = 1; i <= p; i++) {
    		if(p % i == 0) pArr[pidx++] = i;
    	}
    	
    	int qidx = 0;
    	
    	for(int i = 1; i <= q; i++) {
    		if(q % i == 0) qArr[qidx++] = i;
    	}
    	
    	for(int i = 0; i < pidx; i++) {
    		for(int j = 0; j < qidx; j++) {
    			System.out.println(pArr[i] + " " + qArr[j]);
    		}
    	}
    	
    	sc.close();
    }
}