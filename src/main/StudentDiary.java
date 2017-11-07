package main;

import Exceptions.InvalidInputException;
import diary.Diary;
import diary.StudentList;
import display.WelcomePage;
import student.acadamics.Student;

import java.util.Scanner;


public class StudentDiary {

    public int getDiaryType() {
        return diaryType;
    }

    private int diaryType;

    public StudentDiary(){
        //Default
    }

    public static boolean checkInput(int input) {
        if (input > 2 || input < 0) {
            return true;
        } else {
            return false;
        }
    }

    public int setDiaryType(){
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

    public static void main(String[] args) throws Exception {
        Student student = new Student();
        StudentList studentList = new StudentList();
        StudentDiary studentDiary = new StudentDiary();
        Diary diary = new Diary();

        WelcomePage.sayHello();
        WelcomePage.selectDiaryTypeMessage();

        studentDiary.setDiaryType();

        switch(studentDiary.getDiaryType()){
            case 1:
                student = diary.setAllStudentDetails();
                studentList.addToStudentList(student);
                break;
            case 2:
               diary.displayAllStudentDetails(student);
               break;
        }

    }

}
