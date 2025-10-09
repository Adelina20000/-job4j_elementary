package ru.job4j.loop;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;
import static ru.job4j.loop.Counter.sum;

public class CounterTest {

    @Test
    public void whenStartGreaterThanFinishThenResultIsZero() {
        int start = 6;
        int finish = 2;
        int result = sum(start, finish);
        assertTrue(result == 0);
    }

    @Test
    public void whenStartIs5AndFinishIs10ThenResultIs45() {
        int start = 5;
        int finish = 10;
        int result = sum(start, finish);
        assertTrue(result == 45);
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromMinusOneToTenThenThirty() {
        int start = -1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromOneToMinusTenThenZero() {
        int start = 1;
        int finish = -10;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

}
