package 일부터;

import java.util.Scanner;

public class ReverseWord {//일부터.ReverseWord
    Scanner scanner = new Scanner(System.in);
    int number;
    String[] wordlist;
    String word;

    void write(){
        number = scanner.nextInt();
            if(number<3 && number >20){
                throw new RuntimeException("허용되지 않은 범위");
            }
            wordlist =new String[number];
        for(int i=0; i<number; i++){
            word = scanner.next();
            wordlist[i] = word;
        }
    }

    void reverse(){
        for(int i=0; i<number; i++){
            StringBuffer sb = new StringBuffer(wordlist[i]);
            sb.reverse();
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        ReverseWord reverseWord = new ReverseWord();
        reverseWord.write();
        reverseWord.reverse();
    }
}
