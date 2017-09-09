package tdd.fizbuzz;

public class FizzBuzz {

    public String getAnswerFor(int number) {
        if (isDivisibleByThree(number) && isDivisibleByFive(number) ) {
            return "FizzBuzz";
        }
        if (containsThree(number) || isDivisibleByThree(number)) {
            return "Fizz";
        }
        if (containsFive(number) || isDivisibleByFive(number)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private boolean containsFive(int number) {
        return containsDigit(number, 5);
    }

    private boolean containsThree(int number) {
        return containsDigit(number, 3);
    }

    private boolean isDivisibleByFive(int number) {
        return number % 5 == 0;
    }

    private boolean isDivisibleByThree(int number) {
        return number % 3  == 0;
    }

    private boolean containsDigit(int number, int digit) {
        while (number > 0) {
            if (number % 10 == digit) {
                return true;
            }
            number = number / 10;
        }
        return false;
    }
}
