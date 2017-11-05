package student;

import student.acadamics.Course;
import student.acadamics.Marks;
import student.acadamics.Student;

import java.util.ArrayList;

public class Test {

    /* This is a test class whose only
     * purpose is to test the classes
     * that have been created.
     */

    public static void main(String[] args) {



        Marks m = new Marks();
        Course c = new Course("OOPS", 10, "CSE202", m);
        ArrayList<Course> courseList = new ArrayList<>();
        courseList.add(c);
        courseList.add(c);
        Student s = new Student("Gaga", "AM.EN.U4CSE16002","CSE", courseList);
        m.setFirstInternals(45.0);
        m.setSecondInternals(49.0);
        m.setEndSem(99.00);
        m.setAttendance(2);
        m.setContinuousEvaluationMarks(
                11);
        m.getTotalAverage();
        m.getGrade();
        System.out.println(s.toString());
        //System.out.println(m.toString());
        //System.out.println(c.toString());
    }
}
