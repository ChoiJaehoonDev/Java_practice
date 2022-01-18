package Queue.PriorityQ;

import java.io.*;
import java.util.*;

public class BOJ_1655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> bigQ = new PriorityQueue<>();
        PriorityQueue<Integer> smallQ = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i< n; i++){
            int num = Integer.parseInt(br.readLine());

            if(bigQ.size() == smallQ.size()) smallQ.offer(num);
            else bigQ.offer(num);

            if(!bigQ.isEmpty()) {
                if (bigQ.element() < smallQ.element()) {
                    int tempB = bigQ.poll();
                    int tempS = smallQ.poll();
                    bigQ.offer(tempS);
                    smallQ.offer(tempB);
                }
            }
            bw.write(smallQ.element() + "\n");
        }

        bw.flush();
        bw.close();

    }
}
