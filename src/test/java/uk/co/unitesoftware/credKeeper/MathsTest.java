package uk.co.unitesoftware.credKeeper;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by adam on 21/06/2017.
 */
public class MathsTest {
    @Test
    public void add() throws Exception {
        Maths maths = new Maths();
        int result = maths.add(1,2);
        Assert.assertEquals(3,result);

        result = maths.add(-1,-1);
        Assert.assertEquals(-2,result);
    }

}