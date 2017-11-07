package diary;

import java.util.ArrayList;

public class DiaryList {

    private ArrayList<Diary> diaryList;

    private void addToDiaryList(Diary diary) {
        diaryList.add(diary);
    }

    public ArrayList<Diary> getDiaryList() {
        return diaryList;
    }

}
