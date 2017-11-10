package student;

import java.io.Serializable;
import java.util.ArrayList;

public class Arrears implements Serializable{


    private ArrayList<String> arrearSubjects = new ArrayList<>();
    private int numberOfArrears;

    public Arrears() {
        //Default
    }

    public Arrears(ArrayList<String> arrearSubjects, int numberOfArrears) {
        this.arrearSubjects = arrearSubjects;
        this.numberOfArrears = numberOfArrears;
    }

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
