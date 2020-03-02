package calculator;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

public class MainTest {


    @Test
    public void addTest(){
        Main.memory = 0;

        ArrayList<Double> testInput = new ArrayList<Double>();
        testInput.add(5.0);
        testInput.add(3.0);

        Main.add(testInput);
        double expected = 8.0;
        Assert.assertEquals(Double.toString(expected), Double.toString(Main.memory));
    }

    @Test
    public void substractTest(){
        Main.memory = 0;
        ArrayList<Double> testInput = new ArrayList<Double>();
        testInput.add(10.0);
        testInput.add(3.0);

        Main.subtract(testInput);
        double expected = 7.0;
        Assert.assertEquals(Double.toString(expected), Double.toString(Main.memory));
    }

    @Test
    public void multiplyTest(){
        Main.memory = 0;

        ArrayList<Double> testInput = new ArrayList<Double>();
        testInput.add(10.0);
        testInput.add(3.2);

        Main.multiply(testInput);
        double expected = 32.0;
        Assert.assertEquals(Double.toString(expected), Double.toString(Main.memory));
    }

    @Test
    public void divideTest(){
        Main.memory = 0;

        ArrayList<Double> testInput = new ArrayList<Double>();
        testInput.add(20.0);
        testInput.add(4.0);

        Main.divide(testInput);
        double expected = 5.0;
        Assert.assertEquals(Double.toString(expected), Double.toString(Main.memory));
    }

}
