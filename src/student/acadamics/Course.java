package student.acadamics;

import java.io.Serializable;

public class Course implements Serializable {
	private String courseName;
	private int credits;
	private String courseCode;
	private Marks marks;

	public Course(){
		//Default Constructor
	}

	public Course(String subject,
		   int credits,
		   String courseCode,
		   Marks marks) {
		this.courseName = subject;
		this.credits = credits;
		this.marks = marks;
		this.courseCode = courseCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public Marks getMarks() {
		return marks;
	}

	public void setMarks(Marks marks) {
		this.marks = marks;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String toString() {
		return "\n   Course Code : " + getCourseCode() + " | Course: "
				+ getCourseName() + " | Credits: " + getCredits() + "\n   Marks: " + getMarks();
	}

}
