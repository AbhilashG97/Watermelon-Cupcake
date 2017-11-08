package diary;

import student.acadamics.Student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class StudentList {

    private ArrayList<Student> studentList;

    public StudentList(){
        studentList = new ArrayList<>();
    }

    public  void addToStudentList(Student student) {
        studentList.add(student);
    }

    public Student getStudent(int index){
        return studentList.get(index);
    }

    public ArrayList<Student> getStudentList() {
        Collections.sort(studentList);
        return studentList;
    }

    public void writeToFile() throws Exception{
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("I:\\eclipse-workspace\\Watermelon-Cupcake\\data\\studentList"));
        oos.writeObject(getStudentList());
    }

    public ArrayList<Student> readFromFile() throws Exception{
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("I:\\eclipse-workspace\\Watermelon-Cupcake\\data\\studentList"));
        ArrayList<Student> studentList = (ArrayList<Student>) ois.readObject();
        return studentList;
    }
}
