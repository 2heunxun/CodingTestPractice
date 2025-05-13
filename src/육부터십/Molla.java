package 육부터십;

import java.util.Scanner;

public class Molla {
    Scanner scanner = new Scanner(System.in);
    String inner;

    void input(){
        inner = scanner.next();
        if(inner.length()>100){
            throw new RuntimeException("유효하지 않는 길이");
        }
    }

    void number(){
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<inner.length();i++){
            if(Character.isDigit(inner.charAt(i))) {
                sb.append(inner.charAt(i));
            }
        }
        while(sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Molla molla = new Molla();
        molla.input();
        molla.number();
    }
}
