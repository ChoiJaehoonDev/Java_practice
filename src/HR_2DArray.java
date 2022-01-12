import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HR_2DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [][] map = new int[6][6];
        int i = 0;

        while(i < 6){
            StringTokenizer st =new StringTokenizer(br.readLine());
            for(int j = 0; j < 6 ; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
            i++;

        }
        int maxV = -400;
        int [] dy = {-1,-1,-1,0,1,1,1};
        int [] dx = {-1,0,1,0,-1,0,1};
        for(int y = 1; y< 5; y++){
            for (int x = 1; x< 5; x++){
                int temp = 0;
                for(int d = 0; d < 7; d++){
                    temp += map[y+dy[d]][x+dx[d]];
                }
                if(temp >= maxV) maxV = temp;
            }
        }
        System.out.println(maxV);
    }
}
