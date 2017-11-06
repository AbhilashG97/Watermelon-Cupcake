package student.nonAcademic;

import java.util.ArrayList;
import java.util.Iterator;

public class Sports {
    ArrayList<String> eventName = new ArrayList<>();
    private int gold;
    private int silver;
    private int bronze;
    private int participation;

    public Sports() {
        gold = 0;
        silver = 0;
        bronze = 0;
        participation = 0;
    }

    public void setMedals(char c, int n) {
        if (c == 'B')
            bronze++;
        else if (c == 'G')
            gold++;
        else if (c == 'S')
            silver++;
        else
            participation++;
    }

    public void setEventName(String s) {
        eventName.add(s);
    }

    public void printEventName() {
        Iterator it = eventName.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
