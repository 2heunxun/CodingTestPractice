package Section2;
import java.util.*;

public class Fibonachi { //3-4 피보나치 수열
    Scanner scanner = new Scanner(System.in);
    int number;
    int[] fibo;

    void inner(){
        number = scanner.nextInt();
        fibo = new int[number];
    }
    void run(){
        fibo[0] = 1;
        fibo[1] = 1;
        for(int i = 2; i < fibo.length; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        for (int i = 0; i < fibo.length; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(fibo[i]);
        }


    }

    public static void main(String[] args) {
        Fibonachi fibonachi = new Fibonachi();
        fibonachi.inner();
        fibonachi.run();
    }
}
