import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
    	int[] g = {1, 2, 3, 3, 4, 10};
    	int[] s = {1, 2, 2, 2, 3, 5, 10};
    	
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++) {
        	int gSum = 0;
        	int sSum = 0;
        	
        	for(int j = 0; j < 6; j++) {
        		gSum += sc.nextInt() * g[j];
        	}
        	
        	for(int j = 0; j < 7; j++) {
        		sSum += sc.nextInt() * s[j];
        	}
        	
        	if(gSum > sSum) System.out.println("Battle " + i + ": Good triumphs over Evil");
        	else if(gSum == sSum) System.out.println("Battle " + i + ": No victor on this battle field");
        	else System.out.println("Battle " + i + ": Evil eradicates all trace of Good");
        }
        
    }
}
// 호빗, 인간, 엘프, 드워프, 독수리, 마법사 
// 오크, 인간, 워그, 고블린, 우럭하이, 트롤, 마법사 