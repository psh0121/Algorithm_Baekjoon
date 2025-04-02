import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();	// 딸의 수 
    	int o = sc.nextInt();	// 남은 팬던트의 수 
    	
    	int steal = o / (n-1);
    	int minMedal = o + steal;
    	
    	if(o - (steal * (n-1)) == 0) System.out.println((minMedal-1) + " " + minMedal);
    	else System.out.println(minMedal + " " + minMedal);
    	
    	sc.close();
    }
}