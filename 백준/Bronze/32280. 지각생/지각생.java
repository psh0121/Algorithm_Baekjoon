import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> studentTime = new ArrayList<>();
        int teacherTime = 0;
        int cnt = 0;

        for(int i = 0; i < n+1; i++) {
            String[] time = sc.next().split(":");
            String job = sc.next();

            if(job.equals("teacher")) {
                teacherTime = Integer.parseInt(time[0] + time[1]);
            }
            else {
                studentTime.add(Integer.parseInt(time[0]+time[1]));
            }
        }

        String[] temp = sc.next().split(":");
        int schoolTime = Integer.parseInt(temp[0] + temp[1]);

        for(int i = 0; i < studentTime.size(); i++) {
            if(studentTime.get(i) >= teacherTime && studentTime.get(i) >= schoolTime) cnt++;
        }

        System.out.println(cnt);
        sc.close();
    }
}