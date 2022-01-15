package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BOJ_2161 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Deque<Integer> q = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            q.offerLast(i);
        }

        while(true){
            sb.append(q.pollFirst() + " ");
            if(q.isEmpty()) break;
            else q.offerLast((q.pollFirst()));
        }
        System.out.println(sb);
    }
}
