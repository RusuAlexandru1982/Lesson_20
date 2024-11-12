
class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) throws InvalidNameException, InvalidAgeException {
        if (firstName == null || firstName.isEmpty()) {
            throw new InvalidNameException("First name cannot be null or empty.");
        }
        if (lastName == null || lastName.isEmpty()) {
            throw new InvalidNameException("Last name cannot be null or empty.");
        }
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Age must be between 0 and 150.");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

     public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
    }
}