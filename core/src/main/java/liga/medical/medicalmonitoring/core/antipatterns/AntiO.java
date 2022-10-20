package liga.medical.medicalmonitoring.core.antipatterns;

public class AntiO {
    private int pointX;
    private int pointY;

    public AntiO() {
        pointX = 15;
        pointY = 15;
    }

    // Если нам потребуется изменить логику данной функции
    // мы нарушим принцип O
    public int calculatePoint() {
        return pointX + pointY * 10;
    }
}
