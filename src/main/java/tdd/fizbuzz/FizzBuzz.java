package tdd.fizbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public String getAnswerFor(int number) {
        if (isDivisibleByThree(number) && isDivisibleByFive(number)) {
            return "FizzBuzz";
        }
        if (isDivisibleByThree(number)) {
            return "Fizz";
        }
        if (isDivisibleByFive(number)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private boolean isDivisibleByThree(int number) {
        return number % 3 == 0;
    }

    private boolean isDivisibleByFive(int number) {
        return number % 5 == 0;
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        List<String> answers = new ArrayList<>();
        for (int number = 1; number <= 100; number++) {
            answers.add(fizzBuzz.getAnswerFor(number));
        }
        System.out.println(String.join(",", answers));
    }

}
