package diary;

import display.NewDiaryDisplay;
import student.Course;
import student.Marks;
import student.Student;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StudentAssimilator {

    private Student student;
    private Course course;
    private int numberOfCourses;


    private Marks marks;
    private BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

    public StudentAssimilator() {
        student = null;
        course = null;
        marks = null;
        numberOfCourses = 0;
    }

    public Student getStudent() {
        return student;
    }

    public Course setCourseToBeTaken() throws Exception {
        course = new Course();

        NewDiaryDisplay.displayCourseDetailsPage();

        NewDiaryDisplay.displaySetCourseNameMessage();
        course.setCourseName(bfr.readLine());

        NewDiaryDisplay.displaySetCourseCodeMessage();
        course.setCourseCode(bfr.readLine());

        NewDiaryDisplay.displaySetCreditsMessage();
        course.setCredits(Integer.parseInt(bfr.readLine()));

        course.setMarks(setAllMarksToZero());

        return course;
    }

    //IDEA : - Create an ENUM/HashMap for courses and then select the course[key] based on the
    // course code[value] entered by the user.


    public Marks setMarksOfCoursesTaken() throws Exception {
        marks = new Marks();

        NewDiaryDisplay.displayMarksPage();

        NewDiaryDisplay.displaySetFirstInternalsMarksMessage();
        marks.setFirstInternals(Double.parseDouble(bfr.readLine()));

        NewDiaryDisplay.displaySetSecondPeriodicalMarksMessage();
        marks.setSecondInternals(Double.parseDouble(bfr.readLine()));

        NewDiaryDisplay.displaySetEndSemesterExamMarksMessage();
        marks.setEndSem(Double.parseDouble(bfr.readLine()));

        NewDiaryDisplay.displaySetContinuousEvaluationMarksMessage();
        marks.setContinuousEvaluationMarks(Double.parseDouble(bfr.readLine()));

        NewDiaryDisplay.displaySetAttendanceMessage();
        marks.setAttendance(Double.parseDouble(bfr.readLine()));

        return marks;
    }

    public Marks setAllMarksToZero(){

        marks = new Marks();

        marks.setFirstInternals(0.0);
        marks.setSecondInternals(0.0);
        marks.setEndSem(0.0);
        marks.setContinuousEvaluationMarks(0.0);
        marks.setAttendance(0.0);

        return marks;
    }

    public Student setAllStudentDetails(Student student) throws Exception {
        NewDiaryDisplay.displayStudentDetailsPage();

        NewDiaryDisplay.displaySetNameMessage();
        student.setName(bfr.readLine());

        NewDiaryDisplay.displaySetRollNoMessage();
        student.setRollNumber(bfr.readLine());

        NewDiaryDisplay.displaySetBatchMessage();
        student.setBatch(bfr.readLine());

        NewDiaryDisplay.displaySetNumberOfCourses();
        numberOfCourses = Integer.parseInt(bfr.readLine().trim());

        while (numberOfCourses-- > 0) {
            student.addCourseToCourseList(setCourseToBeTaken());
        }

        return student;
    }

    public Student setAllStudentDetails() throws Exception {
        student = new Student();
        NewDiaryDisplay.displayStudentDetailsPage();

        NewDiaryDisplay.displaySetNameMessage();
        student.setName(bfr.readLine());

        NewDiaryDisplay.displaySetRollNoMessage();
        student.setRollNumber(bfr.readLine());

        NewDiaryDisplay.displaySetBatchMessage();
        student.setBatch(bfr.readLine());

        NewDiaryDisplay.displaySetNumberOfCourses();
        numberOfCourses = Integer.parseInt(bfr.readLine().trim());

        while (numberOfCourses-- > 0) {
            student.addCourseToCourseList(setCourseToBeTaken());
        }

        return student;
    }


    public void displayAllStudentDetails(Student student){
        System.out.println(student.toString());
    }

}
