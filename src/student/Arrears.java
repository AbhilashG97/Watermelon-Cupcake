package student;

import java.util.ArrayList;

public class Arrears {

    private ArrayList<String> arrearSubjects = new ArrayList<>();
    private int numberOfArrears;

    public int getNumberOfArrears() {
        return numberOfArrears;
    }

    public void setNumberOfArrears(int numberOfArrears) {
        this.numberOfArrears = numberOfArrears;
    }

    public ArrayList<String> getArrearSubjects() {
        return arrearSubjects;
    }

    public void setArrearSubjects(String course) {
        arrearSubjects.add(course);
    }
}
