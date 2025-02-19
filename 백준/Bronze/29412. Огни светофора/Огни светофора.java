import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        int gb = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        int ry = sc.nextInt();
        int t = sc.nextInt();

        int lightTime = g + gb + y + r + ry;   // 한번 신호가 켜지는데 필요한 시간
        int green = g + (gb/2);
        int yellow = y + ry;
        int red = r + ry;

        int lightTimeCnt = t / lightTime;
        int lightTimeCntMod = t % lightTime;

        int[] lightArr = new int[3];
        lightArr[0] = red * lightTimeCnt;
        lightArr[1] = yellow * lightTimeCnt;
        lightArr[2] = green * lightTimeCnt;

        if(lightTimeCntMod <= g) lightArr[2] += lightTimeCntMod;
        else if(lightTimeCntMod <= (g + gb)) {
            lightArr[2] += g;
            lightArr[2] += (lightTimeCntMod - g) / 2;
        }
        else if(lightTimeCntMod <= (g + gb + y)) {
            lightArr[2] += g;
            lightArr[2] += gb / 2;
            lightArr[1] += (lightTimeCntMod - g - gb);
        }
        else if(lightTimeCntMod <= (g + gb + y + r)) {
            lightArr[2] += g;
            lightArr[2] += gb / 2;
            lightArr[1] += y;
            lightArr[0] += (lightTimeCntMod - g - gb - y);
        }
        else {
            lightArr[2] += g;
            lightArr[2] += gb / 2;
            lightArr[1] += y;
            lightArr[0] += r;
            lightArr[0] += (lightTimeCntMod - g - gb - y - r);
            lightArr[1] += (lightTimeCntMod - g - gb - y - r);
        }

        System.out.println(lightArr[0] + " " + lightArr[1] + " " + lightArr[2]);
        sc.close();
    }
}
