package List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<int[]> balloons = new ArrayList<>();
        for(int i = 1; i<= n;i++){
            balloons.add(new int[]{i, Integer.parseInt(st.nextToken())});
        }

        int target = 0;

        StringBuilder sb = new StringBuilder();

        while (true){

            int temp = target;
            sb.append(balloons.get(target)[0]);
            sb.append(' ');



            if(balloons.get(target)[1] < 0) target += balloons.get(target)[1];
            else target += balloons.get(target)[1] -1;
            balloons.remove(temp);
            if(balloons.isEmpty()) break;

            while (target >= balloons.size()) target -= balloons.size();
            while (target < 0) target += balloons.size();

        }
        System.out.println(sb);
    }
}
