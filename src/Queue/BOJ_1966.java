package Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> printer = new ArrayDeque<>();

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while(t> 0){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int order = Integer.parseInt(st.nextToken());

            StringTokenizer orders = new StringTokenizer(br.readLine());


            Deque<Integer> q = new ArrayDeque<>();

            Integer [] descending = new Integer[n];

            for(int i = 0; i< n; i++){
                int num = Integer.parseInt(orders.nextToken());
                q.offerLast(num);
                descending[i] = num;

            }


            Arrays.sort(descending, Collections.reverseOrder());

            int turn = 0; // 몇번째로 뽑았다는 결과값
            while(!q.isEmpty()){
                if(q.peekFirst() == descending[turn]){
                    if(order == 0){
                        System.out.println(turn+1);
                        break;
                    }else{
                        q.pollFirst();
                        turn++;
                    }
                }else{
                    q.offerLast(q.pollFirst());
                }
                if(order == 0) order += q.size()-1;
                else order -= 1;
            }

            t--;
        }
    }
}
