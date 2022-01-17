package Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int roll = 0;
        ArrayDeque<Integer> q = new ArrayDeque<>();

        for(int i = 1; i<=n; i++){
            q.offerLast(i);
        }
        Roll r = new Roll(q, roll);

        while(st.hasMoreTokens()){
            int target = Integer.parseInt(st.nextToken());

            while(true) {
                if (q.peekFirst() == target) {
                    q.pollFirst();
                    break;
                } else {
                    Roll rl = rollLeft(q.clone(), target);
                    Roll rr = rollRight(q.clone(), target);

                    if(rl.roll > rr.roll){
                        roll += rr.roll;
                        q = rr.getQ();
                    }else{
                        roll += rl.roll;
                        q = rl.getQ();

                    }
                }

            }
        }
        System.out.println(roll);
    }

    static Roll rollRight(ArrayDeque<Integer> q, int target){

        int rr = 0;
        while(q.peekFirst() != target){
            q.offerFirst(q.pollLast());
            rr++;
        }
        Roll r = new Roll(q, rr);
        return r;
    }
    static Roll rollLeft(ArrayDeque<Integer> q, int target){

        int rl = 0;
        while(q.peekFirst() != target){
            q.offerLast(q.pollFirst());
            rl++;
        }
        Roll r = new Roll(q, rl);
        return r;
    }

    static class Roll{
        private ArrayDeque<Integer> q;
        private int roll;

        public Roll(ArrayDeque<Integer> q, int roll){
            this.roll = roll;
            this.q = q;
        }

        public ArrayDeque<Integer> getQ() {
            return q;
        }

        public void setQ(ArrayDeque<Integer> q) {
            this.q = q;
        }

        public int getRoll() {
            return roll;
        }

        public void setRoll(int roll) {
            this.roll = roll;
        }
    }
}
