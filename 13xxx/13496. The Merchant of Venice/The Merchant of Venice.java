import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int dataCnt = sc.nextInt();		// 데이터 개수 
		
		int boat, speed, day;		// 보트수, 속도, 기한
		
		int money = 0;		// 지불할 수 있는 돈 
		
		int distance, inMoney;		// 남은거리, 배안에 있는 돈 
		
		for(int i = 0; i < dataCnt; i++) {
			boat = sc.nextInt();
			speed = sc.nextInt();
			day = sc.nextInt();
			
			money = 0;
			
			for(int j = 0; j < boat; j++) {
				distance = sc.nextInt();
				inMoney = sc.nextInt();
				
				if(distance <= speed * day) money += inMoney;
			}
			
			System.out.println("Data Set " + (i+1) + ":");
			System.out.println(money);
			System.out.println();
		}
		
		sc.close();
	}
}         
