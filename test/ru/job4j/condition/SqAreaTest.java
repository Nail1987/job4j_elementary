package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqAreaTest {

    @Test
    public void squareFor() {
        int p = 4;
        int k = 1;
        double expected = 1.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenp6k2s2() {
        int k = 2;
        int p = 6;
        double expected = 2;
        double s = SqArea.square(p, k);
        assertThat(s, is(expected));
    }
}