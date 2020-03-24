package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.Max(1, 4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenFirstMax() {
        int result = MultiMax.Max(6, 4, 2);
        assertThat(result, is(6));
    }
    @Test
    public void whenDontMax() {
        int result = MultiMax.Max(1, 1, 1);
        assertThat(result, is(1));
    }
}