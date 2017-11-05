package student.nonAcademic;
import java.util.ArrayList;
import java.util.Iterator;
public class Arrears {
        public int noOfArrears;
        ArrayList <String> nameOfSubjects = new ArrayList<String>();
        public void setNoOfArrears(int n){
            this.noOfArrears = n;
        }
        public int getNoOfArrears(){
            return this.noOfArrears;
        }
        public void printNameOfArrears(){
            Iterator it = nameOfSubjects.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
        }
    }
}
