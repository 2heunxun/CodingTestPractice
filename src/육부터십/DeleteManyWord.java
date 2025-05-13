package 육부터십;

import java.util.*;

public class DeleteManyWord {
    String inner;

    Scanner scanner = new Scanner(System.in);

    void input(){
        inner = scanner.nextLine();
        if(inner.length()>100){
            throw new RuntimeException("허용하지 않는 길이입니다.");
        }
    }

    void delete(){

        StringBuffer st = new StringBuffer();
        for(char c: inner.toCharArray()){
            if(st.indexOf(String.valueOf(c))==-1){  //이부분이 킥
                st.append(c);
            }
        }
        System.out.println(st.toString());
    }

    public static void main(String[] args) {
        DeleteManyWord deleteManyWord = new DeleteManyWord();
        deleteManyWord.input();
        deleteManyWord.delete();
    }
}
