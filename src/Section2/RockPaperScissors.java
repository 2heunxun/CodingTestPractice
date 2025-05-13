package Section2;

import java.util.Scanner;

public class RockPaperScissors { //2-3 가위바위보
    Scanner scanner = new Scanner(System.in);
    int A[];
    int B[];
    int gameCount;

    void inner(){
        gameCount=scanner.nextInt();
        A=new int[gameCount];
        for(int i=0;i<gameCount;i++){
            A[i]=scanner.nextInt();
        }
        B=new int[gameCount];
        for(int i=0;i<gameCount;i++){
            B[i]=scanner.nextInt();
        }
    }

    void run(){
        //A 승리요건 B승리요건 동점요건
        for(int i=0;i<gameCount;i++){
            if(A[i]==B[i]){
                System.out.println("D");
            }
            else if((A[i]==1&&B[i]==2)||(A[i]==2&&B[i]==3)||(B[i]==1&&A[i]==3)){
                System.out.println("B");
            }
            else if((A[i]==2&&B[i]==1)||(A[i]==3&&B[i]==2)||(B[i]==3&&A[i]==1)){
                System.out.println("A");
            }
        }
    }

    public static void main(String[] args) {
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        rockPaperScissors.inner();
        rockPaperScissors.run();
    }
}
