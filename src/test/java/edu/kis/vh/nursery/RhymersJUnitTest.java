package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

    @Test
    public void testCountIn() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int TEST_VALUE = 4;
        rhymer.countIn(TEST_VALUE);
        Assert.assertEquals(TEST_VALUE, rhymer.peekaboo());
    }

    @Test
    public void testCallCheck() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        Assert.assertTrue(rhymer.callCheck());
        final int TEST_VALUE = 888;
        rhymer.countIn(TEST_VALUE);
        Assert.assertFalse(rhymer.callCheck());
    }

    @Test
    public void testIsFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int STACK_CAPACITY = 12;
        final int TEST_VALUE = 888;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            Assert.assertFalse(rhymer.isFull());
            rhymer.countIn(TEST_VALUE);
        }
        Assert.assertTrue(rhymer.isFull());
    }

    @Test
    public void testPeekaboo() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.peekaboo());

        final int TEST_VALUE = 4;
        rhymer.countIn(TEST_VALUE);
        Assert.assertEquals(TEST_VALUE, rhymer.peekaboo());
    }

    @Test
    public void testCountOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.countOut());

        final int TEST_VALUE = 4;
        rhymer.countIn(TEST_VALUE);

        Assert.assertEquals(TEST_VALUE, rhymer.countOut());
        Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.countOut());
    }

}
