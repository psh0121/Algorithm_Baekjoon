import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int price = sc.nextInt();
		int salePrice = price;
		
		if(cnt >= 20) salePrice = Math.min(salePrice, (int)(price*0.75));
		if(cnt >= 15) salePrice = Math.min(salePrice, price-2000);
		if(cnt >= 10) salePrice = Math.min(salePrice, (int)(price*0.9));
		if(cnt >= 5) salePrice = Math.min(salePrice, price-500);
		
		System.out.println(salePrice < 0 ? 0 : salePrice);
	}
}         