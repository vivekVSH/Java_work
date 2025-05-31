import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

// write basic code for inheritance
class animal {
    String color;
}

class cat extends animal {
    public void sound() {
        System.out.print("meo meo");
    }
}

// write multiple inhritance
interface one {
    void euu();
}

class two implements one {
    public void euu() {

    }
}

class three implements one {
    public void euu() {

    }
}

class four extends two {
    public void euu() {
        super.euu();
    }
}

public class ten {
    public static String uniqueString(String input) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder str = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
                str.append(c);
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        // try catch method
        try {
            FileInputStream fis = new FileInputStream("input.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // create unique string from one string
        String input = "vivekhande";
        String output = uniqueString(input);
        System.out.println(output);

        // null pointer exection
        String st = null;

        try {
            if (st.equals("vivek")) {
                System.out.println("String are equal");
            } else {
                System.out.println("String are not equal");
            }
        } catch (NullPointerException e) {
            System.out.println("Here is caugth NullPointerException");
        }
    }
}
