
public class Main {
    public static void main(String[] args) {
       //tasck = 1
        try {
            // Crearea obiectelor 
            Person person1 = new Person("", "Ionescu", 30);
            Person person2 = new Person("Cas", "casienescu", 25);
            Person person3 = new Person("Tstar", "Tatarescu", 20);
            Person person4 = new Person("Andrei", "Vasile", 200);

            System.out.println(person1);
        } catch (InvalidNameException | InvalidAgeException e) {
            System.out.println("Error tasck 1: " + e.getMessage());
        }
// Tasck = 2
        Numbers numbers = new Numbers();
        try {
            numbers.divideBy(5);
            numbers.divideBy(0);
            numbers.divideBy(10);
        } catch (IllegalArgumentException e) {

            System.out.println("Error Tasck 2: " + e.getMessage());
        }

    }
    // Tasck = 3
    /*
    NumberDiv7 utils = new NumberDiv7();

        try {

        int result = utils.countDivisibleBy7Numbers(1, 50);
        System.out.println("Numbers divisible by 7: " + result);


        result = utils.countDivisibleBy7Numbers(50, 1);
       System.out.println("Numbers divisible by 7: " + result);

    } catch (InvalidRangeException e) {

        System.out.println("Error Task 3: " + e.getMessage());
    }
    */

}