package Queue.PriorityQ;

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_2696 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while(n>0){

            PriorityQueue<Integer> max = new PriorityQueue<>();
            PriorityQueue<Integer> min = new PriorityQueue<>(Collections.reverseOrder());
            StringBuilder sb = new StringBuilder();
            int size = Integer.parseInt(br.readLine());
            int check = size;
            int i = 0;
            StringBuilder line = new StringBuilder();
            while(check > 0){
                line.append(br.readLine() + " ");
                check -= 10;
            }
            st = new StringTokenizer(line.toString());
            while(i<size){

                if(min.size() == max.size()) min.offer(Integer.parseInt(st.nextToken()));
                else max.offer(Integer.parseInt(st.nextToken()));

                if(!max.isEmpty() && max.element() < min.element()){
                    int temp1 = max.poll();
                    int temp2 = min.poll();
                    max.offer(temp2);
                    min.offer(temp1);
                }

                if(i%2==0) sb.append(min.element() + " ");
                if(i%20 == 18) sb.append("\n");

                i++;
            }
            bw.write(min.size() + "\n");
            bw.write(sb.toString() + "\n");
            bw.flush();
            n--;
        }
        bw.close();
    }
}
