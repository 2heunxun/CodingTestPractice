package 일부터;

import java.util.Scanner;

public class ChangeAlphabet {
    Scanner scanner = new Scanner(System.in);

    String input;
    static String output;

    void write(){
        input = scanner.nextLine();
        if(input.length()>=100){
            throw new RuntimeException("오류입니다.");
        }
    }

    String change(){
        String result="";
        for(int i=0; i<input.length(); i++){
            char c= input.charAt(i);
            if(Character.isLowerCase(c)){
                result+=Character.toUpperCase(c);
            }
            else if(Character.isUpperCase(c)){
                result+=Character.toLowerCase(c);

            }

        }
        return result;
    }

    public static void main(String[] args) {
        ChangeAlphabet changeAlphabet = new ChangeAlphabet();
        changeAlphabet.write();
        output = changeAlphabet.change();
        System.out.println(output);
    }
}
