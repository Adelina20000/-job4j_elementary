package ru.job4j;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ConverterTest {

    @Test
    public void whenConvert180RblThen2Euro() {
        double input = 180;
        double expected = 2.0;
        double output = Converter.rubleToEuro(input);
        double precision = 0.0001;
        assertThat(output).isEqualTo(expected, within(precision));
    }

    @Test
    public void whenConvert225RblThen3Dollar() {
        double input = 225;
        double expected = 3.0;
        double output = Converter.rubleToDollar(input);
        double precision = 0.0001;
        assertThat(output).isEqualTo(expected, within(precision));
    }

    @Test
    public void whenConvert0RblToEuroThen0() {
        double input = 0;
        double expected = 0.0;
        double output = Converter.rubleToEuro(input);
        double precision = 0.0001;
        assertThat(output).isEqualTo(expected, within(precision));
    }

    @Test
    public void whenConvert0RblToDollarThen0() {
        double input = 0;
        double expected = 0.0;
        double output = Converter.rubleToDollar(input);
        double precision = 0.0001;
        assertThat(output).isEqualTo(expected, within(precision));
    }

    @Test
    public void whenConvertNegativeRblToEuro() {
        double input = -90;
        double expected = -1.0;
        double output = Converter.rubleToEuro(input);
        double precision = 0.0001;
        assertThat(output).isEqualTo(expected, within(precision));
    }

    @Test
    public void whenConvertNegativeRblToDollar() {
        double input = -150;
        double expected = -2.0;
        double output = Converter.rubleToDollar(input);
        double precision = 0.0001;
        assertThat(output).isEqualTo(expected, within(precision));
    }

}