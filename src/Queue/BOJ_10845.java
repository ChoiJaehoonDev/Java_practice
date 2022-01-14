package Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Deque<Integer> q = new ArrayDeque<>();
        while (n > 0){
            st = new StringTokenizer(br.readLine());
            String oper = st.nextToken();

            switch (oper){
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    q.offerLast(num);
                    break;
                case "front":
                    if(!q.isEmpty()) System.out.println(q.peekFirst());
                    else System.out.println(-1);
                    break;
                case "pop":
                    if(!q.isEmpty()) System.out.println(q.pollFirst());
                    else System.out.println(-1);
                    break;
                case "size":
                    System.out.println(q.size());
                    break;
                case "empty":
                    if(q.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                case "back":
                    if(!q.isEmpty()) System.out.println(q.peekLast());
                    else System.out.println(-1);
                    break;
            }

            n--;
        }
    }
}
