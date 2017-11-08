package student;

import java.util.ArrayList;
import java.util.Iterator;

public class Projects {
    ArrayList<String> projectNames = new ArrayList<String>();
    private int prj;

    public void setNameOfProjects(String name) {
        projectNames.add(name);
    }

    public int getNoOfProjects() {
        return this.prj;
    }

    public void setNoOfProjects(int n) {
        this.prj = n;
    }

    public void printNameOfProjects() {
        Iterator it = projectNames.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
