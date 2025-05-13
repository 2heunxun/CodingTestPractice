package 육부터십;
import java.util.*;

public class ReverseEqual {
    Scanner scanner = new Scanner(System.in);
    String word;

    void input(){
        word = scanner.nextLine();
        if(word.length()>100){
            throw new RuntimeException("유효하지 않은 초과 범위입니다.");
        }
    }

    void check(){
        String compare = word.toLowerCase();
        StringBuffer sb = new StringBuffer(compare);
        sb.reverse();
        if(sb.toString().equals(compare)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        ReverseEqual reverseEqual = new ReverseEqual();
        reverseEqual.input();
        reverseEqual.check();
    }
}
