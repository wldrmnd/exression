import org.junit.Assert;
import org.junit.Test;

public class LombokTest {

    @Test
    public void testClass() {
        Person person = new Person();
        person.setAge(10);
        Integer number = Integer.parseInt("123");
        Assert.assertEquals(Integer.valueOf(10), person.getAge());
        ///500-x=545
    }
}
