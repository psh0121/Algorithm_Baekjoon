import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] t = new double[10];
        for(int i = 0; i < 10; i++) t[i] = sc.nextDouble();

        double tAvg = 0;
        for(int i = 0; i < 10; i++) tAvg += t[i];
        tAvg = (double)tAvg / 10;

        double st = 0.0;
        for(int i = 0; i < 10; i++) {
            double cal = (t[i] - tAvg) * (t[i] - tAvg);
            st += cal;
        }

        st /= 10;
        st = Math.sqrt(st);

        if(st <= 1.0) System.out.println("COMFY");
        else System.out.println("NOT COMFY");
        sc.close();
    }
}