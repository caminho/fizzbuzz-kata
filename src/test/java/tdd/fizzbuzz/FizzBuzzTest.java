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
    public void shouldReturnNumber(int input) {

        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.getAnswerFor(input);

        assertThat(answer).isEqualTo(String.valueOf(input));
    }

    @Test
    @Parameters({"3", "6", "9"})
    public void shouldReturnFizz(int input) {

        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.getAnswerFor(input);

        assertThat(answer).isEqualTo("Fizz");
    }

    @Test
    @Parameters({"5", "10", "20", "25"})
    public void shouldReturnBuzz(int input) {

        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.getAnswerFor(input);

        assertThat(answer).isEqualTo("Buzz");
    }

    @Test
    @Parameters({"15", "30", "45", "60", "75", "90"})
    public void shouldReturnFizzBuzz(int input) {

        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.getAnswerFor(input);

        assertThat(answer).isEqualTo("FizzBuzz");
    }

    @Test
    @Parameters({"13", "23", "31", "33", "34", "36", "37", "39"})
    public void shouldReturnFizzWhenInputContainsThree(int input) {

        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.getAnswerFor(input);

        assertThat(answer).isEqualTo("Fizz");
    }

    @Test
    @Parameters({"50", "52", "55", "56", "58", "59"})
    public void shouldReturnBuzzWhenInputContainsFive(int input) {

        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.getAnswerFor(input);

        assertThat(answer).isEqualTo("Buzz");
    }
}
