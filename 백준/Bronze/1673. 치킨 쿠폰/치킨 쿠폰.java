import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int n = sc.nextInt();
			int k = sc.nextInt();

			int chicken = 0;
			int stamp = 0;

			while (n > 0) {
				// 치킨 수량 추가, 스탬프 찍기
				chicken += n;
				stamp += n;
				n = 0;

				// 스탬프가 치킨교환이 가능할 경우 쿠폰 추가 받기, 치킨쿠폰 얻은만큼 스탬프차감
				if(stamp >= k) {
					n += stamp / k;
					stamp -= n * k;
				}
			}

			System.out.println(chicken);

		}
		sc.close();
    }
}
