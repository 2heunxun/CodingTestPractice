package Section2;


import java.util.Scanner;

public class Main {
    int inputNumber;
    Scanner scanner = new Scanner(System.in);
    int answer;
    int previewAnswer = 0;
    void input(){
        inputNumber=scanner.nextInt();
        if(inputNumber<=1 || inputNumber>200000){
            throw new RuntimeException("잘못된 범위 값입니다.");
        }
    }

    void solution(){
        answer=0;
        for(int k=2;k<inputNumber;k++) {
            previewAnswer=answer;
            for (int i = 2; i < k; i++) {
                if (k % i == 0) {
                    if (previewAnswer == answer) {
                        answer++;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.input();
    }
}
/*
https://velog.io/@thsdnjst/Java-%EC%97%90%EB%9D%BC%ED%86%A0%EC%8A%A4%ED%85%8C%EB%84%A4%EC%8A%A4%EC%9D%98-%EC%B2%B4
 */