package 육부터십;
import java.util.*;

public class Palindrome {
    Scanner scanner = new Scanner(System.in);
    String inner;

    void input(){
        inner =scanner.nextLine();
        if(inner.length()>100){
            throw new RuntimeException("유요하지 않는 범위");
        }
    }

    void check(){
        int start = 0;
        int end = inner.length()-1;
        inner=inner.toLowerCase();
        String result ="YES";
        while(start<end){
            if(!Character.isAlphabetic(inner.charAt(start))){
                start++;
            }
            else if(!Character.isAlphabetic(inner.charAt(end))){
                end--;
            }
            else if(inner.charAt(start) != inner.charAt(end)){
                result="NO";
                break;
            }else{
                start++;
                end--;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.input();
        palindrome.check();
    }
}
