package ru.job4j.calculator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static ru.job4j.calculator.Fit.manWeight;
import static ru.job4j.calculator.Fit.womanWeight;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short input = 180;
        double expected = 92;
        double output = manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void whenWoman170Then69() {
        /* Написать свой тест. */
        short input = 170;
        double expected = 69;
        double output = womanWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(11.5));
    }

}
