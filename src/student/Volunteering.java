package student;

import java.util.ArrayList;

public class Volunteering {
    
    private int numberOfEventsVolunteered;

    public ArrayList<String> getVolunteeredEvents() {
        return volunteeredEvents;
    }

    public void setVolunteeredEvents(String eventName) {
        volunteeredEvents.add(eventName);        
    }

    private ArrayList<String> volunteeredEvents; 

    public int getNumberOfEventsVolunteered() {
        return numberOfEventsVolunteered;
    }

    public void setNumberOfEventsVolunteered(int numberOfEventsVolunteered) {
        this.numberOfEventsVolunteered = numberOfEventsVolunteered;
    }

}
