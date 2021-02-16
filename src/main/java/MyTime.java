import java.util.GregorianCalendar;

public class MyTime {

    private String title;
    private GregorianCalendar calendar = new GregorianCalendar();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GregorianCalendar getCalendar() {
        return calendar;
    }

    public void setCalendar(GregorianCalendar calendar) {
        this.calendar = calendar;
    }
}
