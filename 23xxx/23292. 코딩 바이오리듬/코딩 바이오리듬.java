import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String YYYYMMDD = sc.next();
        int Y1 = Character.getNumericValue(YYYYMMDD.charAt(0));
        int Y2 = Character.getNumericValue(YYYYMMDD.charAt(1));
        int Y3 = Character.getNumericValue(YYYYMMDD.charAt(2));
        int Y4 = Character.getNumericValue(YYYYMMDD.charAt(3));
        int M1 = Character.getNumericValue(YYYYMMDD.charAt(4));
        int M2 = Character.getNumericValue(YYYYMMDD.charAt(5));
        int D1 = Character.getNumericValue(YYYYMMDD.charAt(6));
        int D2 = Character.getNumericValue(YYYYMMDD.charAt(7));

        int n = sc.nextInt();

        double highRhythm = Double.MIN_VALUE;
        String value = "";

        for(int i = 0; i < n; i++) {
            String yyyymmdd = sc.next();
            int y1 = Character.getNumericValue(yyyymmdd.charAt(0));
            int y2 = Character.getNumericValue(yyyymmdd.charAt(1));
            int y3 = Character.getNumericValue(yyyymmdd.charAt(2));
            int y4 = Character.getNumericValue(yyyymmdd.charAt(3));
            int m1 = Character.getNumericValue(yyyymmdd.charAt(4));
            int m2 = Character.getNumericValue(yyyymmdd.charAt(5));
            int d1 = Character.getNumericValue(yyyymmdd.charAt(6));
            int d2 = Character.getNumericValue(yyyymmdd.charAt(7));

            double rhythm = (double)(Math.pow(Y1 - y1, 2) + Math.pow(Y2 - y2, 2) + Math.pow(Y3 - y3, 2) + Math.pow(Y4 - y4, 2)) * 
                         (Math.pow(M1 - m1, 2) + Math.pow(M2 - m2, 2)) * 
                         (Math.pow(D1 - d1, 2) + Math.pow(D2 - d2, 2));

            if(rhythm > highRhythm) {
                highRhythm = rhythm;
                value = yyyymmdd;
            }
            else if(rhythm == highRhythm) {
                if(Integer.parseInt(yyyymmdd) < Integer.parseInt(value)) {
                    value = yyyymmdd;
                }
            }
        }
        
        System.out.println(value);
        sc.close();
    }
}
