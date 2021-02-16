import CalculateExpression.Expression;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExpressionTest {

    private Expression expression;

    @Before
    public void init() {
        System.out.println("какая-то настройка щтук которая нам будет нужна в тестах");
    }

    @Test
    public void testSum() {
        expression = new Expression("100+x=200");
        Assert.assertEquals(Double.valueOf(100), expression.getX());
    }

    @Test
    public void testSubtraction() {
        expression = new Expression("300-x=200");
        Assert.assertEquals(Double.valueOf(100), expression.getX());
    }

    @Test
    public void testMultiplication() {
        expression = new Expression("100*x=500");
        Assert.assertEquals(Double.valueOf(5), expression.getX());
    }

    @Test
    public void testDivision() {
        expression = new Expression("100/x=200");
        Assert.assertEquals(Double.valueOf(0.5), expression.getX());
    }
}
