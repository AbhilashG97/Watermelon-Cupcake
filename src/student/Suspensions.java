package student;

import java.util.ArrayList;
import java.util.Iterator;

public class Suspensions {
    ArrayList<String> reasonOfSuspension = new ArrayList<>();
    private int noOfSuspensions;

    public Suspensions() {
        noOfSuspensions = 0;
    }

    public void setNoOfSuspensions(int n) {
        this.noOfSuspensions = n;
    }

    public int getNoOfSuspentions() {
        return this.noOfSuspensions;
    }

    public void reasonOfSuspention() {
        Iterator it = reasonOfSuspension.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
