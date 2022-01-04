import java.util.*;
import java.io.*;

public class BOJ_11725 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int i, j;
        ArrayList<Integer>[] list = new ArrayList[n + 1]; // 초기화
        for (i = 1; i <= n; i++) {
            list[i] = new ArrayList<Integer>();
        }
        for (i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }
        int [] parents = new int[n+1];
        dfs(list, parents, 1, 0);

        for(i = 2; i <= n; i++){
            System.out.println(parents[i]);
        }
    }

    private static void dfs(ArrayList<Integer> [] list, int [] parents, int start, int parent){
        parents[start] = parent;
        for(int temp : list[start]){
            if(temp != parent) dfs(list, parents, temp, start);
        }
    }

    private static void bfs(){

    }
}

