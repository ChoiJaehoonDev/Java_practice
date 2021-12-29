import java.io.*;
import java.util.*;

public class BOJ_5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int test = Integer.parseInt(st.nextToken());

        for (int t = 0; t < test; t++) {
            boolean dir = true; //true : 정방향 /
            String[] lines = new String[3];

            for (int o = 0; o < 3; o++) {
                st = new StringTokenizer(br.readLine());
                lines[o] = st.nextToken();
            }



            Deque<Integer> element = new ArrayDeque<>();

            char [] oper = lines[0].toCharArray();

            if(!lines[2].equals("[]")) {
                String data = lines[2].substring(1, lines[2].length() - 1);
                String[] datas = data.split(",");

                for (String s : datas) {
                    element.offerFirst(Integer.parseInt(s));
                }
            }

            boolean temp = false;
            for(char c : oper){
                switch (c){
                    case 'R':
                        dir = !dir;
                        break;
                    case 'D':
                        if (!dir){
                            if(element.pollFirst() == null){
                                temp = true;
                            }
                        }else{
                            if(element.pollLast() == null){
                                temp = true;
                            }
                        }
                        break;
                }

                if (temp){
                    System.out.println("error");
                    break;
                }
            }
            if (!temp){
                StringBuilder sb = new StringBuilder();
                sb.append('[');
                if(!dir){
                    while(!element.isEmpty()){
                        sb.append(element.pollFirst());
                        if(element.size() != 0){
                            sb.append(',');

                        }
                    }
                }else{
                    while(!element.isEmpty()){

                        sb.append(element.pollLast());
                        if(element.size() != 0){
                            sb.append(',');

                        }
                    }
                }

                sb.append(']');
                System.out.println(sb);
            }
        }
    }
}
