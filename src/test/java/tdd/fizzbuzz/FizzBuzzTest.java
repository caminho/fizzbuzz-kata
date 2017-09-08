package tdd.fizzbuzz;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import tdd.fizbuzz.FizzBuzz;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzTest {

    @Test
    @Parameters({"1", "2", "4", "7"})
    public void shouldReturnNumberWhenInputIsNotDivisibleByThreeOrFive(Integer input) {

        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.getAnswerFor(input);

        assertThat(answer).isEqualTo(input.toString());
    }

    @Test
    @Parameters({"3", "6", "9", "12", "99"})
    public void shouldReturnFizzWhenInputIsDivisibleByThreeAndNotByFive(int input) {

        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.getAnswerFor(input);

        assertThat(answer).isEqualTo("Fizz");
    }

    @Test
    @Parameters({"5", "10", "20", "25", "35", "40", "100"})
    public void shouldReturnBuzzWhenInputDivisibleByFiveAndNotByThree(int input) {

        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.getAnswerFor(input);

        assertThat(answer).isEqualTo("Buzz");
    }

    @Test
    @Parameters({"15", "30", "45", "60", "75", "90"})
    public void shouldReturnFizzBuzzWhenInputIsDivisibleByThreeAndFive(int input) {

        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.getAnswerFor(input);

        assertThat(answer).isEqualTo("FizzBuzz");
    }
}
