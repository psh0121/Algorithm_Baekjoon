import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
          String[] time = sc.next().split(":");
          int hh = Integer.parseInt(time[0]);
          int mm = Integer.parseInt(time[1]);
          int ss = Integer.parseInt(time[2]);

          String hhBinary = Integer.toBinaryString(hh);
          String mmBinary = Integer.toBinaryString(mm);
          String ssBinary = Integer.toBinaryString(ss);

          hhBinary = "0".repeat(6-hhBinary.length()) + hhBinary;
          mmBinary = "0".repeat(6-mmBinary.length()) + mmBinary;
          ssBinary = "0".repeat(6-ssBinary.length()) + ssBinary;

          String[][] arr = {hhBinary.split(""), mmBinary.split(""), ssBinary.split("")};
          String result1 = "";
          String result2 = "";

          for(int j = 0; j < arr.length; j++) {
            for(int k = 0; k < arr[j].length; k++) {
              result2 += arr[j][k];
            }
          }

          for(int j = 0; j < arr[0].length; j++) {
            for(int k = 0; k < arr.length; k++) {
              result1 += arr[k][j];
            }
          }

          System.out.println(result1 + " " + result2);
        }
        sc.close();
    }
}