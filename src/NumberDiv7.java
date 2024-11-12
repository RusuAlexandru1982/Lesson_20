
class InvalidRangeException extends Exception {
    public InvalidRangeException(String message) {
        super(message);
    }
}
public class NumberDiv7 {

    public int countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) throws InvalidRangeException {

        if (inferiorLimit > superiorLimit) {
            throw new InvalidRangeException("Cannot be greater than superior limit.");
        }

        int count = 0;

        for (int i = inferiorLimit; i <= superiorLimit; i++) {
            if (i % 7 == 0) {
                count++;
            }
        }

        return count;
    }
}

