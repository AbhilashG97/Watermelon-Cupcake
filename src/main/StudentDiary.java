package main;

import diary.StudentAssimilator;
import diary.StudentList;
import display.ExistingDiaryDisplay;
import display.NewDiaryDisplay;
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
        if (input > 4 || input < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        Student student;
        StudentList studentList = new StudentList();
        StudentDiary studentDiary = new StudentDiary();
        StudentAssimilator assimilator = new StudentAssimilator();
        Scanner scanner = new Scanner(System.in);
        WelcomePage.sayHello();
        WelcomePage.selectDiaryTypeMessage();

        studentDiary.setDiaryType();

        switch (studentDiary.getDiaryType()) {
            case 1:
                NewDiaryDisplay.displayNumberOfStudentsToBeCreated();
                int numberOfStudentsToBeCreated = scanner.nextInt();
                while(numberOfStudentsToBeCreated-->0){
                    student = assimilator.setAllStudentDetails();
                    studentList.addToStudentList(student);
                    studentList.writeToFile();
                }
                break;
            case 2:
                ArrayList<Student> stuList = studentList.readFromFile();
                if(stuList.isEmpty()){
                    System.err.println("Currently, there are no students registered");
                }else{
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
                    System.out.println();
                    assimilator.setAllStudentDetails(studentDiary.selectedStudent);
                    studentList.writeToFile(stuList);
                }
                break;
            case 3:
                ArrayList<Student> displayStudentList = studentList.readFromFile();
                Collections.sort(displayStudentList);
                for (Student iterator : displayStudentList) {
                    assimilator.displayAllStudentDetails(iterator);
                }
                break;
            case 4:
                ArrayList<Student> deleteStudentList = studentList.readFromFile();
                Collections.sort(deleteStudentList);
                int index = 0;
                for (Student iterator : deleteStudentList) {
                    System.out.println(index + " -> " + iterator.getName());
                }
                deleteStudentList.remove(index);
                studentList.writeToFile(deleteStudentList);
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
                System.err.println("Please select a suitable option");
            } else {
                break;
            }
        }
        return diaryType;
    }
}
