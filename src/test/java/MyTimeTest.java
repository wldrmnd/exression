import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.GregorianCalendar;

public class MyTimeTest {

    private MyTime time;

    @Before
    public void init() {
        time = new MyTime();
    }

    @Test
    public void commonTest() {
        time.setTitle("belorussian");
        Assert.assertEquals("belorussian", time.getTitle());
    }

    @Test
    public void learYearTest() {
        GregorianCalendar calendar = time.getCalendar();
        System.out.println(calendar.getTime());
        System.out.println(calendar);
    }
}
