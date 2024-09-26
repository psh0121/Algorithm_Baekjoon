import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] time = sc.next().split(":");
		int hh = Integer.parseInt(time[0]);
		int mm = Integer.parseInt(time[1]);
		int i = 0;
		int cnt = sc.nextInt();

		if(mm == 15 || mm == 30 || mm == 45) {
			i++;
		}
		else if(mm == 0) {
			i += hh;
		}

		while(i < cnt) {
			if(mm >= 0 && mm < 15) mm = 15;
			else if(mm >= 15 && mm < 30) mm = 30;
			else if(mm >= 30 && mm < 45) mm = 45;
			else {
				mm = 0;
				hh++;

				if(hh == 13) hh = 1;
			}

			if(mm == 15 || mm == 30 || mm == 45) {
				i++;
			}
			else if(mm == 0) {
				i += hh;
			}
		}

		System.out.printf("%02d:%02d", hh, mm);
		sc.close();
    }
}
