package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] line = br.readLine().toCharArray();
        Stack<Character> laser = new Stack<>();
        int answer = 0;
        for (int i = 0; i < line.length - 1; i++) {
            if (line[i] == '(' && line[i + 1] == ')') {
                answer += laser.size();
                i++;
            } else if (line[i] == '(') {
                answer += 1;
                laser.push(line[i]);
            }
            else if(line[i] == ')'){
                laser.pop();
            }
        }
        System.out.println(answer);

    }
}
