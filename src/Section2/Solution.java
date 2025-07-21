package Section2;

import java.util.Scanner;

public class Solution {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputnumber = scanner.nextInt();
        int plusScore = 0;
        int[] solve = new int[inputnumber];
        int totalScore =0;

        for(int i = 0; i < inputnumber; i++) {
            solve[i] = scanner.nextInt();
        }

        for(int i = 0; i < inputnumber; i++) {
            if(solve[i] == 1) {
                plusScore++;
                totalScore += plusScore;
            }
            if(solve[i] == 0) {
                plusScore = 0;
            }
        }
        System.out.println(totalScore);
    }
}
