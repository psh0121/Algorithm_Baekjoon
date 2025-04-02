import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int connectPhone = 0;
    int totalBattery = 0;
    int battery = 0;

    for(int i = 0; i < n; i++) {
      int phone = sc.nextInt();

      if(phone != connectPhone) {
        battery = 2;
        totalBattery += battery;
        connectPhone = phone;
      }
      else {
        battery *= 2;
        totalBattery += battery;
      }

      if(totalBattery >= 100) {
        totalBattery = 0;
        battery = 0;
        connectPhone = 0;
      }
    }

    System.out.println(totalBattery);
		sc.close();
    }
}
