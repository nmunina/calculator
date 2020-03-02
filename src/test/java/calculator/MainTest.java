package calculator;

import org.junit.*;
import java.util.ArrayList;

public class MainTest {
    private ArrayList<Double> testInput;

    @Before public void init() {
        Main.memory = 0;
        testInput = new ArrayList<Double>();
    }

    @Test
    public void addTest(){

        testInput.add(5.0);
        testInput.add(3.0);

        Main.add(testInput);
        double expected = 8.0;
        Assert.assertEquals(Double.toString(expected), Double.toString(Main.memory));
    }

    @Test
    public void substractTest(){
        testInput.add(10.0);
        testInput.add(3.0);

        Main.subtract(testInput);
        double expected = 7.0;
        Assert.assertEquals(Double.toString(expected), Double.toString(Main.memory));
    }

    @Test
    public void multiplyTest(){
        testInput.add(10.0);
        testInput.add(3.2);

        Main.multiply(testInput);
        double expected = 32.0;
        Assert.assertEquals(Double.toString(expected), Double.toString(Main.memory));
    }

    @Test
    public void divideTest(){
        testInput.add(20.0);
        testInput.add(4.0);

        Main.divide(testInput);
        double expected = 5.0;
        Assert.assertEquals(Double.toString(expected), Double.toString(Main.memory));
    }
}
