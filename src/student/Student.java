package student;

import java.io.*;
import java.util.*;

public class Student implements Serializable, Comparable<Student> {

    public ArrayList<Course> coursesTakenList = new ArrayList<>();
    private NonAcademics nonAcademics;
    private String name;
    private String rollNumber;
    private String batch;

    public Student() {
        //Default Constructor
    }

    public Student(String name, String rollNo, String batch, ArrayList<Course> courseList,
                   NonAcademics nonAcademics) {
        this.name = name;
        this.rollNumber = rollNo;
        this.batch = batch;
        this.nonAcademics = nonAcademics;
        coursesTakenList.addAll(courseList);
    }

    public NonAcademics getNonAcademics() {
        return nonAcademics;
    }

    public void setNonAcademics(NonAcademics nonAcademics) {
        this.nonAcademics = nonAcademics;
    }

    public ArrayList<Course> getCoursesTakenList() {
        return coursesTakenList;
    }

    public void setCoursesTakenList(Course course) {
        coursesTakenList.add(course);
    }

    public void addCourseToCourseList(Course course) {
        coursesTakenList.add(course);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public ArrayList<Course> getCourses() {
        return coursesTakenList;
    }


    @Override
    public String toString() {
        return "Student Name : " + getName() + "\nRoll Number : " + getRollNumber() +
                "\nBatch : " + getBatch() + "\nCourses : " + getCourses();
    }

    @Override
    public int compareTo(Student student) {

        if (Integer.parseInt(rollNumber) == Integer.parseInt(student.rollNumber)) {
            return 0;
        } else if (Integer.parseInt(rollNumber) > Integer.parseInt(student.rollNumber)) {
            return 1;
        } else {
            return -1;
        }
    }
}
