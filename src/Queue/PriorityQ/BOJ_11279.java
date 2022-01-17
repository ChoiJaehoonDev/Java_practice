package Queue.PriorityQ;

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class BOJ_11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i<n; i++){
            int num = Integer.parseInt(br.readLine());

            if(num == 0){
                if(q.isEmpty()) bw.write(0 + "\n");
                else bw.write(q.poll() + "\n");
            }else q.offer(num);

        }

        bw.flush();
        bw.close();
    }
}
