package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void sumFor55() {
        int start = 0;
        int finish = 10;
        int expected = 55;
        int out = Counter.sum(start, finish);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void sumFor36() {
        int start = 3;
        int finish = 8;
        int expected = 36;
        int out = Counter.sum(start, finish);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void sumFor1() {
        int start = 1;
        int finish = 1;
        int expected = 1;
        int out = Counter.sum(start, finish);
        Assert.assertEquals(expected, out);
    }

}