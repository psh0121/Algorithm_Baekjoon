import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
        String sum = Integer.toString(sc.nextInt() + sc.nextInt());
        System.out.println(sum.length());
    }
}