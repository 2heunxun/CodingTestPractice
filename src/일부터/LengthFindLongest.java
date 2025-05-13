package 일부터;

import java.util.Scanner;

public class LengthFindLongest {
    Scanner scanner = new Scanner(System.in);
    String input;

    void write(){
        input = scanner.nextLine();
        if(input.length()>=100){
            throw new RuntimeException("문자열 초과");
        }
    }

    String findLong(){
        String[] find= input.split(" ");
        String result = find[0];
        for(int i=1; i<find.length; i++){
            if(find[i].length()>=result.length()){
                result = find[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        LengthFindLongest lengthFindLongest = new LengthFindLongest();
        lengthFindLongest.write();
        String answer = lengthFindLongest.findLong();
        System.out.println(answer);
    }

}
