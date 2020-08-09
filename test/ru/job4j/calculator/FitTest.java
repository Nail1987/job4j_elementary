package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void manWeightFor160() {
        double heightMan = 160;
        double expected = 69;
        double out = Fit.manWeight(heightMan);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeightFor155() {
        double heightWoman = 155;
        double expected = 51.74;
        double out = Fit.womanWeight(heightWoman);
        Assert.assertEquals(expected, out, 0.01);
    }
}