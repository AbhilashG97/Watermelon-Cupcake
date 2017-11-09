package student;

import java.util.ArrayList;

public class Projects {

    private ArrayList<String> projectNames;
    private int numberOfProjects;

    public Projects(){
        projectNames = new ArrayList<>();
        numberOfProjects = 0;
    }

    public ArrayList<String> getProjectNames() {
        return projectNames;
    }

    public void setProjectNames(String projectName) {
        projectNames.add(projectName);
    }

    public int getNumberOfProjects() {
        return numberOfProjects;
    }

    public void setNumberOfProjects(int numberOfProjects) {
        this.numberOfProjects = numberOfProjects;
    }

}
