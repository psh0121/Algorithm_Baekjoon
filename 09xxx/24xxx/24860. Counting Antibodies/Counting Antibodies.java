import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		long v1 = sc.nextLong();
		long j1 = sc.nextLong();
		long v2 = sc.nextLong();
		long j2 = sc.nextLong();
		long v = sc.nextLong();
		long d = sc.nextLong();
		long j = sc.nextLong();
		
		long heavyChain = v * d * j;
		long lightChain1 = v1 * j1;
		long lightChain2 = v2 * j2;
		
		System.out.println(heavyChain * (lightChain1 + lightChain2));
	}
}         