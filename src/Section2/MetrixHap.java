package Section2;

import java.util.*;

public class MetrixHap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int[][] matrix = new int[input][input];
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        //---------------------------------------
        int max = 0;
        int temp = 0;
        // 세로줄
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                temp += matrix[i][j];
            }
            if(temp > max) {
                max = temp;

            }
            temp = 0;
        }

        for(int j=0; j < matrix.length; j++) {
            for(int i = 0; i < matrix.length; i++) {
                temp += matrix[i][j];
            }
            if(temp > max) {
                max = temp;
            }
            temp = 0;
        }

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if( i== j) {
                    temp += matrix[i][j];
                }
            }
            if(temp > max) {
                max = temp;
            }
        }
        temp = 0;

        for(int i = 4; i > 0; i--) {
            for(int j = 4; j > 0; j--) {
                if( i== j) {
                    temp += matrix[i][j];
                }
                if(temp > max) {
                    max = temp;
                }

            }
        }
        temp = 0;

        System.out.println(max);
    }
}
