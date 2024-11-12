class Numbers {


    public void divideBy(int number) {
        // Verificăm dacă numărul este 0
        if (number == 0) {

            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        System.out.println("Result of division by " + number + ": " + (100 / number));
    }
}