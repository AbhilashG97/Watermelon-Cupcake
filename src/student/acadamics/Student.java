package student.acadamics;

import java.io.*;
import java.util.*;

public class Student implements Serializable, Comparable<Student> {
	private String name;
	private String rollNumber;
	private String batch;
	public ArrayList<Course> coursesTaken = new ArrayList<>();

	public Student(){
		//Default Constructor
	}

	public Student(String name, String rollNo, String batch, ArrayList<Course> courseList) {
		this.name = name;
		this.rollNumber = rollNo.replaceAll(".", "").substring(8);
		this.batch = batch;
		coursesTaken.addAll(courseList);
	}

	public void addCourseToCourseList(Course course){
		coursesTaken.add(course);
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
		this.rollNumber = rollNumber.substring(12);
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public ArrayList<Course> getCourses() {
		return coursesTaken;
	}

	public void setCourses(ArrayList<Course> c) {
		coursesTaken.addAll(c);
	}

	@Override
	public String toString(){
		return "Student Name : " + getName() + "\nRoll Number : " + getRollNumber() +
				"\nBatch : " + getBatch() + "\nCourses : " +getCourses();
	}

	@Override
	public int compareTo(Student student) {

		if(Integer.parseInt(rollNumber) == Integer.parseInt(student.rollNumber)){
			return 0;
		}else if(Integer.parseInt(rollNumber) > Integer.parseInt(student.rollNumber)){
			return 1;
		}else{
			return -1;
		}
	}
}
