package Section2;

import java.util.*;

public class LookAbleStudents { //2-2 보이는 학생
    Scanner scanner = new Scanner(System.in);
    int studentSum;
    int[] student;

    void inner(){
        studentSum = scanner.nextInt();
        student = new int[studentSum];
        for (int i = 0; i < studentSum; i++) {
            student[i] = scanner.nextInt();
        }
    }
    void run(){
        int teacher=1;
        int blocker=0;
        int pointer=1;
        for(int i=0;i<studentSum-1;i++){
            if(student[blocker]<student[pointer]){
                blocker=pointer;
                pointer++;
                teacher++;
            }
            else if(student[blocker]==student[pointer]){
                blocker=pointer;
                pointer++;
            }
            else if(student[blocker]>student[pointer]){
                pointer++;
            }
        }
        System.out.println(teacher);
    }

    public static void main(String[] args) {
        LookAbleStudents lookAbleStudents = new LookAbleStudents();
        lookAbleStudents.inner();
        lookAbleStudents.run();
    }
}
