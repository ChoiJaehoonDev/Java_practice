package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 일시적 보류
public class BOJ_3015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        long answer = 0;
        Stack<Long> line = new Stack<>();

        long rep = 0;
        long maxV = 0;
        while(n > 0){
            // 현재 수와 이전 수 비교
            // answer += line.size()
            // line.peek < now -> pop()
            // 만약 비교했을 때 현재 수 보다 작으면 pop
            // 4 4 3 1 2 경우 생각하기
            long now = Integer.parseInt(br.readLine());
            if(line.isEmpty()) line.push(now);
            else{
                // 1. peek와 now비교
                // 1-1. peek < now
                    // 1-1-1. answer += size
                    // 1-1-2. line.pop
                // 1-2. peek == now
                    // 1-1-1.
                // 1-3. peek > now

                // 2. maxV 와 now 비교

                line.push(now);
            }
            n--;
        }
        System.out.println(answer);
    }

}
