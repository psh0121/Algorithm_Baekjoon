import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	int[] correctP = {0, 12, 11, 11, 10, 9, 9, 9, 8, 7, 6, 6};
    	int[] time = {0, 1600, 894, 1327, 1311, 1004, 1178, 1357, 837, 1055, 556, 773};
        
    	Scanner sc = new Scanner(System.in);
        int rank = sc.nextInt();
        
        System.out.println(correctP[rank] + " " + time[rank]);
    }
}