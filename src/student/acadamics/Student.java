package student;

import java.io.*;
import java.util.*;

public class Student implements Serializable{
	private String name;

	private String rollno;
	private String batch;
	private ArrayList <Course> coursesTaken = new ArrayList<>();

	Student(String n, String r, String b, ArrayList<Course> c){
		name=n;
		rollno=r;
		this.coursesTaken.addAll(c);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRollNo(String roll) {
		rollno = roll;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public void setCourses(ArrayList<Course>c) {
		this.coursesTaken.addAll(c);
	}

	public String getName() {
		return name;
	}
	public String getRollNo() {
		return rollno;
	}
	public String getBatch() {
		return batch;
	}
	public ArrayList<Course> getCourses() {
		return coursesTaken;
	}
}
