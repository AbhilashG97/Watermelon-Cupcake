package student.nonAcademic;
import java.util.ArrayList;
import java.util.Iterator;
public class Projects {
        private int prj;
        ArrayList <String> projectNames = new ArrayList<String>();
        public void setNoOfProjects(int n){
            this.prj=n;
        }
        public void setNameOfProjects(String name){
            projectNames.add(name);
        }
        public int getNoOfProjects(){
            return this.prj;
        }
        public void printNameOfProjects(){
            Iterator it = projectNames.iterator();
            while(it.hasNext()) {
                System.out.println(it.next());
            }

    }
}
