package diary;

import student.acadamics.Student;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class StudentList {

    private ArrayList<Student> studentList;

    public  void addToStudentList(Student student) {
        studentList.add(student);
    }

    public ArrayList<Student> getStudentList() {
        Collections.sort(studentList);
        return studentList;
    }

    public void writeToFile() throws Exception{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(""));
    }
}
