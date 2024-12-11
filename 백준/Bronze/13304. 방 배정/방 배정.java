import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int roomCnt = 0;
		int room12 = 0;
		int room34boy = 0;
		int room56boy = 0;
		int room34girl = 0;
		int room56girl = 0;

		for(int i = 0; i < n; i++) {
			int s = sc.nextInt();
			int y = sc.nextInt();

			if(y <= 2) {
				room12++;
				if(room12 == k) {
					roomCnt++;
					room12 = 0;
				}
			}
			else if(y <= 4) {
				if(s == 0) {
					room34girl++;
					if(room34girl == k) {
						roomCnt++;
						room34girl = 0;
					}
				}
				else {
					room34boy++;
					if(room34boy == k) {
						roomCnt++;
						room34boy = 0;
					}
				}
			}
			else {
				if(s == 0) {
					room56girl++;
					if(room56girl == k) {
						roomCnt++;
						room56girl = 0;
					}
				}
				else {
					room56boy++;
					if(room56boy == k) {
						roomCnt++;
						room56boy = 0;
					}
				}
			}
		}

		if(room12 != 0) roomCnt++;
		if(room34boy != 0) roomCnt++;
		if(room34girl != 0) roomCnt++;
		if(room56boy != 0) roomCnt++;
		if(room56girl != 0) roomCnt++;

		System.out.println(roomCnt);
		sc.close();
    }
}
