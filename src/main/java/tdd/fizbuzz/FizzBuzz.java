package tdd.fizbuzz;

public class FizzBuzz {

    public String getAnswerFor(int number) {
        if (isDivisibleByThree(number) && isDivisibleByFive(number) ) {
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

    private boolean isDivisibleByFive(int number) {
        return number % 5 == 0;
    }

    private boolean isDivisibleByThree(int number) {
        return number % 3  == 0;
    }
}
