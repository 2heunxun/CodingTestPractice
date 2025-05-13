package 일부터;

import java.util.*;
class JumpOtherAlphabetic {
    public String solution(String str){
        String answer;
        char[] s=str.toCharArray();
        int lt=0, rt=str.length()-1;

        while(lt<rt){
            if(!Character.isAlphabetic(s[lt])) lt++;
            //알파벳이 아니면 위치이동 알파벳이면 가만히.
            else if(!Character.isAlphabetic(s[rt])) rt--;
            //알파벳이 아니면 위치이동 알파벳이면 가만히.
            else{
                char tmp=s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
        }
        answer=String.valueOf(s);
        return answer;
    }

    public static void main(String[] args){
        JumpOtherAlphabetic T = new JumpOtherAlphabetic();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}