package ru.job4j.Loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class FactorialTest {

    @Test
    public void calc1() {
        int rsl =Factorial.calc(5);
        int expected = 120;
        assertThat(rsl, is(expected));
    }

}