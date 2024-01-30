package src.manager;

import src.model.DateIO;

import java.sql.Date;
import java.util.ArrayList;

public class DateManager {
    private ArrayList<DateIO> dates = new ArrayList<>();

    public void add(long quantity){
        dates.add(new DateIO(new Date(System.currentTimeMillis()),quantity));
    }
    public long findHistory(String date){
        for (int i = 0 ; i < dates.size();i++){
            if(date.equals(dates.get(i).getDate().toString()))
                return i;
        }
        return -1;
    }
}
