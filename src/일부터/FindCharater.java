package 일부터;

import java.util.Scanner;

public class FindCharater    {
    Scanner scanner = new Scanner(System.in);
    String word;
    String charter;
    void write(){
        word = scanner.nextLine();
        if(word.length()>100){
            throw new RuntimeException("오류");
        }
        charter = scanner.next();{
            if(charter.length()!=1){
                throw new RuntimeException("오류");
            }
        }
    }

    public int find(){
        int findword = 0;
        String findLower= word.toLowerCase();
        char targetLower = charter.toLowerCase().charAt(0);
        for(int i=0; i<word.length(); i++){
            if(targetLower == findLower.charAt(i)){
                findword++;
            }
        }
        return findword;
    }

    public static void main(String[] args) {
        FindCharater findCharacter = new FindCharater();
        findCharacter.write();
        int answer = findCharacter.find();
        System.out.println(answer);
    }
}
/**
* 여기서 중요한것은 대소문자를 변형해주는것이 가장중요하다.
 * Computercooler에 중점을 맞추니깐 비교문자는 미처 생각하지 못하고
 * Computer에 대문자 C만 집중적으로 본것같다.
 * 항상 조심하고. 명심하자. 비교하는 c도 C로 입력될 수 있다는것을....
* */