package Queue.PriorityQ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class BOJ_1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maesu = 0;

        int n = Integer.parseInt(br.readLine());
        int k1 = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        while (n > 1) {
            int num = Integer.parseInt(br.readLine());
            q.add(num);
            n--;
        }

        if (!q.isEmpty()) {
            while (k1 <= q.element()) {
                int top = q.poll();

                top -= 1;
                k1 += 1;
                maesu += 1;
                q.offer(top);
            }
        }
        System.out.println(maesu);

    }
}
