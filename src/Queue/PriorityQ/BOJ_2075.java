package Queue.PriorityQ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_2075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        StringTokenizer st;
        int i = 0;
        while(n> i){
            st = new StringTokenizer(br.readLine());

            while(st.hasMoreTokens()){
                q.offer(Integer.parseInt(st.nextToken()));
            }
            i++;
        }
        int target = 0;
        while(n>0){
            target = q.poll();
            n--;
        }

        System.out.println(target);
    }
}
