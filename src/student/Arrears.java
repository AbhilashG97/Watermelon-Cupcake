package student;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrears {

    public int getNoOfArrears() {
        return noOfArrears;
    }

    public void setNoOfArrears(int noOfArrears) {
        this.noOfArrears = noOfArrears;
    }

    private int noOfArrears;

    ArrayList<Course> nameOfSubjects = new ArrayList<>();

    public void printNameOfArrears() {
        for(Course course : nameOfSubjects){
            System.out.println(course.getCourseName());
        }
    }
}
