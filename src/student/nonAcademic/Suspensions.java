package student.nonAcademic;
import java.util.ArrayList;
import java.util.Iterator;
public class Suspensions {
        private int noOfSuspensions;
        ArrayList <String> reasonOfSuspension = new ArrayList<>();
        public Suspensions(){
            noOfSuspensions=0;
        }
        public void setNoOfSuspensions(int n){
            this.noOfSuspensions=n;
        }
        public int getNoOfSuspentions(){
            return this.noOfSuspensions;
        }
        public void reasonOfSuspention(){
            Iterator it = reasonOfSuspension.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }

        }
}
