package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance1() {
        int x1 = 0;
        int x2 = 2;
        int y1 = 0;
        int y2 = 0;
        double expected = 1;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out,0.01);
    }
}