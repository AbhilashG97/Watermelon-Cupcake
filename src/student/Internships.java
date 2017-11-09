package student;

import java.util.ArrayList;

public class Internships {

    private int numberOfInternships;
    private ArrayList<String> listOfInternships;

    public Internships(){
        listOfInternships = new ArrayList<>();
        numberOfInternships = 0;
    }

    public ArrayList<String> getListOfInternships() {
        return listOfInternships;
    }

    public void setListOfInternships(String internshipName) {
        listOfInternships.add(internshipName);
    }

    public int getNumberOfInternships() {
        return numberOfInternships;
    }


    public void setNumberOfInternships(int numberOfInternships) {
        this.numberOfInternships = numberOfInternships;
    }


}
