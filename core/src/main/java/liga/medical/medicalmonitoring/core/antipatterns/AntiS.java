package liga.medical.medicalmonitoring.core.antipatterns;

import java.util.ArrayList;
import java.util.Date;

public class AntiS {
    private ArrayList<String> pen;
    public AntiS() {
        pen = new ArrayList<String>();
    }

    public void buyPen(int id) {
        if(pen.size() > id) {
            pen.remove(id);
        }
    }

    public Date getCurrentDate() {
        Date currentDate = new Date();
        return currentDate;
    }
}
