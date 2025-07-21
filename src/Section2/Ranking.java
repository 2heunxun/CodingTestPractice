package Section2;

import java.util.Scanner;

class Ranking {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // 입력 영역
        int input = scanner.nextInt();
        int[] array = new int[input];

        for(int i = 0; i < input; i++){
            array[i] = scanner.nextInt();
        }
        //-----------------------------------
        int rank;
        int[] rankArray = new int[input];
        for(int i = 0; i < input; i++){
            rank =1;
            for(int j=0; j<input; j++){
                if(array[i] < array[j]){
                    rank ++;
                }
            }
            rankArray[i] = rank;
        }

        for(int i = 0; i < input; i++){
            System.out.print(rankArray[i] + " ");
        }
    }
}