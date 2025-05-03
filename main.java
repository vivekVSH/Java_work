import java.util.*;

public class main {
    class Calculate {

        // Overloading methods
        int sum(int a, int b) {
            return a + b;
        }

        int sum(int a, int b, int c) {
            return a + b + c;
        }

        // Encapsulation example
        private int div;

        public int getDiv() {
            return div;
        }

        public void setDiv(int div) {
            this.div = div;
        }
    }

    // Overriding example
    class Multi extends Calculate {
        @Override
        int sum(int a, int b) {
            return a * b; // Changed behavior to demonstrate overriding
        }
    }

    public static void main(String[] args) {
        main mainObj = new main(); // Create an instance of the Main class

        // Create an instance of the Calculate class
        Calculate cla = mainObj.new Calculate();

        // Demonstrate encapsulation
        cla.setDiv(6); // Set the value using the setter
        System.out.println("Encapsulated value of div: " + cla.getDiv()); // Get the value using the getter

        // Demonstrate overloading
        System.out.println("Sum of two numbers: " + cla.sum(3, 5)); // Output: 8
        System.out.println("Sum of three numbers: " + cla.sum(1, 2, 3)); // Output: 6

        // Create an instance of the Multi class
        Multi multi = mainObj.new Multi();

        // Demonstrate overriding
        System.out.println("Overridden sum (multiplication of two numbers): " + multi.sum(3, 5)); // Output: 15
    }
}
