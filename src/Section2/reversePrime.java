package Section2;

import java.util.*;

//2-6뒤집은 소수
public class reversePrime {
    Scanner scanner = new Scanner(System.in);
    int[] list;
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
        int rev = 0;

        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }

        return rev;
    }


    boolean isPrime(int num){
        if(num < 2) return false;

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        reversePrime reversePrime = new reversePrime();
        reversePrime.input();

    }

}
