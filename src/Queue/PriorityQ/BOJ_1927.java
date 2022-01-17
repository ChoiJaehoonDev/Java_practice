package Queue.PriorityQ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class BOJ_1927 {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();


        for(int i = 0; i< n; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                if(q.isEmpty()) sb.append(0 + "\n");
                else sb.append(q.poll() + "\n");
            }
            else q.add(num);
        }
        System.out.println(sb);
    }
}
