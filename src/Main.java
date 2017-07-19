
// Example: Singletone design pattern
// This example is based on the code presented at the book:
// "Java Design Pattern Essentials" by Tony Bevis

public class Main {

    public static void main(String[] args) {
        
        SerialNumberGenerator generator = SerialNumberGenerator.getInstance();
        System.out.println(generator.getNextSerialNumber());
        System.out.println(generator.getNextSerialNumber());
        
        // a new object is not created, but the exising singleton is returned
        SerialNumberGenerator anotherGen = SerialNumberGenerator.getInstance();
        System.out.println(anotherGen.getNextSerialNumber());
        System.out.println(anotherGen.getNextSerialNumber());
        
        // error if "new" operator is attempted due to private constructor
        // SerialNumberGenerator g = new SerialNumberGenerator();

    }
}
