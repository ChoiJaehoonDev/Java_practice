package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_16120 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] line = br.readLine().toCharArray();
        char[] PPAP = {'P', 'P', 'A', 'P'};

        Stack<Character> stack = new Stack<>();

        for (char c : line) {
            stack.push(c);

            if (stack.size() >= 4) {
                int itv = stack.size() - 4;
                boolean check = true;
                for (int i = 0; i < 4; i++) {
                    if (stack.elementAt(itv + i) != PPAP[i]) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }
        System.out.println(stack.size()==1?"PPAP":"NP");
    }
}
