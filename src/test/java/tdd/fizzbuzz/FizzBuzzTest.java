package tdd.fizzbuzz;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import tdd.fizbuzz.FizzBuzz;

import static org.assertj.core.api.Assertions.assertThat;

// 7:15

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzTest {

    @Test
    @Parameters({"1", "2", "4", "7"})
    public void shouldPrintNumber(int input) {

        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.getAnswerFor(input);

        assertThat(answer).isEqualTo(String.valueOf(input));
    }
}
