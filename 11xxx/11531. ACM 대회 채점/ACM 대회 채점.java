import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> wrongCntMap = new HashMap<>();
        ArrayList<String> rightProblemList = new ArrayList<>();
        int penalty = 0;

        while (true) {
          int m = sc.nextInt();
          if(m == -1) break;
          String name = sc.next();
          String correct = sc.next();

          // map에 문제에 대한 정보 없을시 초기값 설정
          if(!wrongCntMap.containsKey(name))wrongCntMap.put(name, 0);

          // 문제를 맞췄을때 || 틀렸을때
          if(correct.equals("right")) {
            rightProblemList.add(name);
            penalty += m;
          }
          else {
            wrongCntMap.put(name, wrongCntMap.get(name)+1);
          }
        }

        // 맞춘 문제 밑 패널티 계산
        for(String key : wrongCntMap.keySet()) {
          int value = wrongCntMap.get(key);
          if(rightProblemList.contains(key)) penalty += (value * 20);
        }

        System.out.println(rightProblemList.size() + " " + penalty);
        sc.close();
    }
}