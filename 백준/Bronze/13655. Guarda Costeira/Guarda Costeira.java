import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double d = sc.nextDouble();
            double vf = sc.nextDouble();    // 도둑
            double vg = sc.nextDouble();    // 경찰

            // 도망자가 12해리 수직으로 이동하는 시간
            double ft = 12 / vf;

            // 경비대가 대각선으로 가는 거리 (피타고라스)
            double gd = Math.sqrt(d*d + 12*12);
            // 경비대가 대각선거리를 이동하는 시간
            double gt = gd / vg;

            System.out.println(ft >= gt ? "S" : "N");
        }
        sc.close();
    }
}