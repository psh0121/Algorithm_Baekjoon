import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		char alpha = sc.nextLine().charAt(0);

		int iloveyonsei = 84;	// ILOVEYONSEI 바로 타입시 거리

		System.out.println(iloveyonsei + Math.abs(9 - ((int)alpha - 64)));
		sc.close();
    }
}