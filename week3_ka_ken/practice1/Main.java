package practice1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        
        student.add(new Student("Alice",15,60));
        student.add(new Student("Takuya",12,90));
        student.add(new Student("Ryo",25,34));
        student.add(new Student("Suzanu",18,20));
        
        for (Student info : student) {
        	System.out.println(info);
        }
    }
}    
