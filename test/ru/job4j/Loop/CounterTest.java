package ru.job4j.Loop;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.is;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void sum1to10() {
        int start = 1;
        int finish = 10;
        int expected = 55;
        int out = Counter.sum(start, finish);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void sumByEven1() {
        int rsl = Counter.sumByEven(1,10);
        int expected = 30;
        assertThat(rsl , is(expected));
    }
}