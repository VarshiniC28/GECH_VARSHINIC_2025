package com.customStudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StartStudent {
    public static void main(String[] args) {
        Student std1 = new Student("Sanjay", 1, 19);
        Student std2 = new Student("Shwetha", 4, 23);
        Student std3 = new Student("Nithya", 5, 13);

        List<Student> students = new ArrayList<>();
        students.add(std1);
        students.add(std2);
        students.add(std3);
        students.add(new Student("Varsha", 2, 21));

        System.out.println("Before");
        System.out.println(students);
        
//        students.remove(0); 
//        System.out.println("Updated Students List: " + students);
        
        Collections.sort(students, (s1,s2)-> s2.getRollno()-s1.getRollno()); //s2 to s1 -> higher to lower
        System.out.println("After");
        System.out.println(students);
        
        Collections.sort(students, (s1,s2)-> s1.getRollno()-s2.getRollno()); //s2 to s1 -> lower to higher
        System.out.println("After");
        System.out.println(students);
    }
}
