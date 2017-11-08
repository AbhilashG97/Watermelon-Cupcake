package student;

import java.util.ArrayList;
import java.util.Iterator;

public class Sports extends EventName{
    ArrayList<String> eventName = new ArrayList<>();

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getSilver() {
        return silver;
    }

    public void setSilver(int silver) {
        this.silver = silver;
    }

    public int getBronze() {
        return bronze;
    }

    public void setBronze(int bronze) {
        this.bronze = bronze;
    }

    public int getParticipation() {
        return participation;
    }

    public void setParticipation(int participation) {
        this.participation = participation;
    }

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
