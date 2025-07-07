package Section2;

import java.util.*;

public class Main {


    int input(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }

    int logic(int num){
        int count = 0;
        boolean[] isPrime = new boolean[num+1];
        Arrays.fill(isPrime, true);
        isPrime[0] =isPrime[1]= false;

        for(int i=2; i*i<num; i++){
            if(isPrime[i]){
                for(int j=i*i; j<=num; j+=i){
                    isPrime[j] = false;
                }
            }
        }

        for(int i=2; i<num; i++){
            if(isPrime[i]){
                count++;
            }
        }
        return count;
    }


    void run(){
        int num = input();
        int solve = logic(num);
        System.out.println(solve);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
}
