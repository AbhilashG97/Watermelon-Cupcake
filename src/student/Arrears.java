package student;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrears {

    ArrayList<String> arrearSubjects = new ArrayList<>();
    private int noOfArrears;

    public int getNoOfArrears() {
        return noOfArrears;
    }

    public void setNoOfArrears(int noOfArrears) {
        this.noOfArrears = noOfArrears;
    }

    public ArrayList<String> getArrearSubjects() {
        return arrearSubjects;
    }

    public void setArrearSubjects(String course) {
        arrearSubjects.add(course);
    }

    public void printSubjetcArrears() {

        System.out.println();

        for (String iterator : arrearSubjects) {
            System.out.println(iterator);
        }
    }
}
