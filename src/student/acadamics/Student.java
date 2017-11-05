package student.acadamics;

import java.io.*;
import java.util.*;

public class Student implements Serializable {
	private String name;
	private String rollNo;
	private String batch;
	private ArrayList<Course> coursesTaken = new ArrayList<>();

	public Student(String name, String rollNo, String batch, ArrayList<Course> courseList) {
		this.name = name;
		this.rollNo = rollNo;
		this.batch = batch;
		coursesTaken.addAll(courseList);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String roll) {
		rollNo = roll;
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
		return "Student Name : " + getName() + "\nRoll Number : " + getRollNo() +
				"\nBatch : " + getBatch() + "\nCourses : " +getCourses();
	}
}
