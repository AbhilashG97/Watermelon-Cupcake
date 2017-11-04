package student;

import java.io.Serializable;

public class Course implements Serializable {
	private String subject;
	private int credits;
	private Marks marks;

	Course(String subject, int credits, Marks marks) {
		this.subject = subject;
		this.credits = credits;
		this.marks = marks;
	}

	public Marks getMarks() {
		return marks;
	}

	public void setMarks(Marks marks) {
		this.marks = marks;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String toString() {
		return "Course: " + getSubject() + " Credits: " + getCredits() + " Marks: " + getMarks();
	}

}
