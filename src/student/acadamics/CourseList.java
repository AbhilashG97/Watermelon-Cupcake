package student.acadamics;

import java.io.Serializable;
import java.util.ArrayList;

public class CourseList implements Serializable {

    private ArrayList<Course> courseList;
    private String batch;

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void addCourses(Course course) {
        courseList.add(course);
    }


}
