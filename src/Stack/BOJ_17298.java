package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> NGE = new Stack<>();

        int[] line = new int[n];
        int[] answer = new int[n];
        int idx = 0;

        while (st.hasMoreTokens()) line[idx++] = Integer.parseInt(st.nextToken());

        for (int i = idx - 1; i >= 0; i--) {
            int state; // 0 : peek이 line[i]보다 클때, 1: NGE가 비었을 때
            while (true) {
                if (NGE.isEmpty()) {
                    state = 1;
                    break;
                } else {
                    if (NGE.peek() > line[i]) {
                        state = 0;
                        break;
                    } else  NGE.pop();

                }
            }
            if (state == 1)  answer[i] = -1;
            else answer[i] = NGE.peek();
            NGE.push(line[i]);
        }

        for (int i = 0; i < n; i++) {
            sb.append(answer[i] + " ");
        }
        System.out.println(sb);
    }
}
