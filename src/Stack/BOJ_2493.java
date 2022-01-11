package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> top = new Stack<>();
        top.push(1000000001);
        int[] order = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int i = 1;
        int idx;
        while (st.hasMoreTokens()) {
            int now = Integer.parseInt(st.nextToken());
            idx = i-1;
            if(top.peek() > now){
                order[i] = idx;
            }
            else {
                while (true) {
                    if(now < top.elementAt(order[idx])){
                        order[i] = order[idx];
                        break;
                    }else{
                        idx = order[idx];
                    }
                }
            }
            i++;
            top.push(now);

        }

        StringBuilder sb = new StringBuilder();
        for (int j = 1; j <= n; j++) {
            sb.append(order[j] + " ");
        }
        System.out.println(sb);
    }
}
