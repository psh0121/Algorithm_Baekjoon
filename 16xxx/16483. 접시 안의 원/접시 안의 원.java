import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		double t = sc.nextDouble();
		double value = (t / 2) * (t / 2);

		System.out.println(Math.round(value));
		sc.close();
    }
}