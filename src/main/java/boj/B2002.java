package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class B2002 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cars = Integer.parseInt(br.readLine());
        int answer = 0;
        Map<String, Integer> inList = new HashMap<>();
        for (int i = 0; i < cars; i++) {
            inList.put(br.readLine(), i);
        }
        int[] outList = new int[cars];

        for (int i = 0; i < cars ; i++) {
            outList[i] = inList.get(br.readLine());
        }

        for (int i = 0; i < cars-1 ; i++) {
            for (int j = i+1; j < cars ; j++) {
                if (outList[i] > outList[j]) {
                    answer++;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
