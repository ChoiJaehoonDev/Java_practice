package Queue.PriorityQ;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class BOJ_11286 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) ->
                Math.abs(o1) == Math.abs(o2) ? Integer.compare(o1, o2) : Integer.compare(Math.abs(o1), Math.abs(o2))
        );

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i< n; i++){
            int num = Integer.parseInt(br.readLine());
            if (num == 0){
                if(q.isEmpty()) bw.write(0 + "\n");
                else bw.write(q.poll() + "\n");
            }else q.add(num);

        }
        bw.flush();
        bw.close();
    }
}
