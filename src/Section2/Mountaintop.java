package Section2;
import java.util.*;
class Mountaintop {
    int[] dx={-1, 0, 1, 0};
    int[] dy={0, 1, 0, -1};
 // 상 하 좌 우

    public int solution(int n, int[][] arr){
        int answer=0; //봉우리 수
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                boolean flag=true; // 플레그
                for(int k=0; k<4; k++){
                    int nx=i+dx[k];  //
                    int ny=j+dy[k];
                    if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]){ // x좌표 0보다크고 n보다 작고 , y좌표 0보다 크고n보다 작고 , 주변 arr >= 현재 검사중인 arr 이면 false -> 즉 봉우리 조건에 적합하지 않음
                        flag=false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Mountaintop T = new Mountaintop();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }
}