package diary;

import student.acadamics.Student;

import java.util.ArrayList;

public class Diary {

    private Student student;
    private ArrayList<Student> studentList;

    public void setStudentData(Student student){
        this.student = student;
    }

    public Student getStudent(){
        return student;
    }

    public void addToStudentList(Student student){
        studentList.add(student);
    }


    
}
