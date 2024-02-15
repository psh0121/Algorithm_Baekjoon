import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        String[] uospc = {"u", "o", "s", "p", "c"};
        int[] cnt = {0, 0, 0, 0, 0};
        int minNum = Integer.MAX_VALUE;
        
        int n = sc.nextInt();
        String[] str = sc.next().split("");
        
        for(int j = 0; j < uospc.length; j++) {
       		for(int k = 0; k < str.length; k++) {
       			if(uospc[j].equals(str[k])) cnt[j]++;
       		}
       	}
        
        Arrays.sort(cnt);
        
        System.out.println(cnt[0]);
    }
}