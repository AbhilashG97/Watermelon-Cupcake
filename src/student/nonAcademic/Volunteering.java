package student.nonAcademic;

import java.util.ArrayList;
import java.util.Iterator;

public class Volunteering {
    ArrayList<String> eventNames = new ArrayList<>();

    public void setEventName(String name) {
        eventNames.add(name);
    }

    public void printEventName() {
        Iterator it = eventNames.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
