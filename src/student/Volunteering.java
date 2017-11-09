package student;

import java.util.ArrayList;

public class Volunteering {

    private int numberOfTimesVolunteered;
    private ArrayList<String> volunteeredEvents;

    public ArrayList<String> getVolunteeredEvents() {
        return volunteeredEvents;
    }

    public void setVolunteeredEvents(String eventName) {
        volunteeredEvents.add(eventName);
    }

    public int getNumberOfTimesVolunteered() {
        return numberOfTimesVolunteered;
    }

    public void setNumberOfTimesVolunteered(int numberOfTimesVolunteered) {
        this.numberOfTimesVolunteered = numberOfTimesVolunteered;
    }

}
