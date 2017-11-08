package main;

import diary.Diary;
import diary.StudentList;
import display.ExistingDiaryDisplay;
import display.WelcomePage;
import student.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class StudentDiary {

    private int selectedStudentRollNumber;
    private Student selectedStudent;
    private int diaryType;

    public StudentDiary() {
        //Default
    }

    public static boolean checkInput(int input) {
        if (input > 2 || input < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        Student student;
        StudentList studentList = new StudentList();
        StudentDiary studentDiary = new StudentDiary();
        Diary diary = new Diary();
        Scanner scanner = new Scanner(System.in);
        WelcomePage.sayHello();
        WelcomePage.selectDiaryTypeMessage();

        studentDiary.setDiaryType();

        switch (studentDiary.getDiaryType()) {
            case 1:
                student = diary.setAllStudentDetails();
                studentList.addToStudentList(student);
                studentList.writeToFile();
                diary.displayAllStudentDetails(studentList.getStudent(0));
                break;
            case 2:
                ArrayList<Student> stuList = studentList.readFromFile();
                Collections.sort(stuList);
                for (Student iterator : stuList) {
                    //diary.displayAllStudentDetails(iterator);
                    System.out.println(iterator.getRollNumber());
                }
                ExistingDiaryDisplay.selectStudentRollNumber();
                studentDiary.setSelectedStudentRollNumber(scanner.nextInt());

                for (Student iterator : stuList) {
                    if(Integer.parseInt(iterator.getRollNumber()) == studentDiary.getSelectedStudentRollNumber()){
                        studentDiary.selectedStudent = iterator;
                    }
                }

                ExistingDiaryDisplay.displayModificationPage();
                diary.setAllStudentDetails(studentDiary.selectedStudent);
                break;
        }
    }

    public int getSelectedStudentRollNumber() {
        return selectedStudentRollNumber;
    }

    public void setSelectedStudentRollNumber(int selectedStudentRollNumber) {
        this.selectedStudentRollNumber = selectedStudentRollNumber;
    }

    public int getDiaryType() {
        return diaryType;
    }

    public int setDiaryType() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            diaryType = scanner.nextInt();
            if (checkInput(diaryType)) {
                System.err.println("Please enter 1 or 2");
            } else {
                break;
            }
        }
        return diaryType;
    }
}
