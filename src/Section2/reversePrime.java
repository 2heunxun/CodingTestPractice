package Section2;

import java.util.*;

//2-6뒤집은 소수
public class reversePrime {
    Scanner scanner = new Scanner(System.in);
    int enter;

    void input(){
        enter = scanner.nextInt();
        if(enter <3 || enter >100 ){
            throw new InputMismatchException();
        }
        for (int i = 0; i <enter; i++) {
            int num = scanner.nextInt();
            int reversed = reverse(num);

            if (isPrime(reversed)) {
                System.out.print(reversed + " ");
            }
        }
    }

    // 숫자를 뒤집는 함수
    public static int reverse(int num) {
        int rev = 0; // 변수 초기화
        while (num > 0) { // num 이 0 보다 클 때
            rev = rev * 10 + (num % 10); //
            num /= 10;
        }
        /*
        만약 num이 492라면
        rev = 0 * 10 + (492%10) =>  rev= 2
        492/10 = 49

        rev = 2*10 + (49%10) -> rev = 29
        49/10 = 4

        rev = 29*10 + (4%10) => rev = 294
        2/10 = 0;

         */
        return rev;
    }


    boolean isPrime(int num){
        if(num < 2) return false; // 2미만은 false 소수탈락

        for(int i = 2; i <= Math.sqrt(num); i++){ // 굳이 num 다 돌필요 없이 num루트 가지만 돌아도 됨
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        reversePrime reversePrime = new reversePrime();
        reversePrime.input();

    }

}
