package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        while (n > 0){
            String line = br.readLine();
            switch (line){
                case "top":
                    if(stack.isEmpty()){
                        System.out.println(-1);
                        break;
                    }
                    System.out.println(stack.peek());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "pop":
                    if(stack.isEmpty()){
                        System.out.println(-1);
                        break;
                    }
                    System.out.println(stack.pop());
                    break;
                case "empty":
                    if(stack.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                default:
                    StringTokenizer sb = new StringTokenizer(line);
                    String dump = sb.nextToken();
                    int num = Integer.parseInt(sb.nextToken());
                    stack.push(num);
            }
            n--;
        }

    }
}
