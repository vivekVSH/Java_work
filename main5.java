import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.io.FileWriter;
import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {

        try {
            File myFile = new File("Vivek.txt");
            // to see this file can readable
            myFile.canRead();
            // can to write something
            myFile.canWrite();
            // to create new file
            myFile.createNewFile();
            //to find path
            myFile.getAbsolutePath();
            //to find lenght of file
            myFile.length();
            //to delete the file
            myFile.delete();
            System.out.println(myFile.canWrite());
            System.out.println(myFile.canRead());
            System.out.println(myFile.getAbsolutePath());
            System.out.println(myFile.length());
            System.out.println(myFile.delete());

            if (myFile.createNewFile()) {
                System.out.println("File Crated :" + myFile.getName());
            } else {
                System.out.println("File is already exists");
            }

            // To write something in the file
            FileWriter newFile = new FileWriter("Vivek.txt");
            newFile.write("hello my name is vivek");
            newFile.close();

            // To read data from file using scanner class
            Scanner myScanner = new Scanner(myFile);
            while (myScanner.hasNextLine()) {
                String data = myScanner.nextLine();
                System.out.print(data);
            }
            myScanner.close();

        } catch (IOException e) {
            System.out.println("An Error is occur");
            e.printStackTrace();
        }

        // create hashmap
        HashMap<String, String> newMap = new HashMap<String, String>();
        newMap.put("Vivek", "Hande");
        newMap.put("Yash", "Kakade");
        newMap.put("Alok", "More");
        System.out.println(newMap);

        // create a hashset and add element
        HashSet<Integer> newSet = new HashSet<Integer>();
        newSet.add(11);
        newSet.add(22);
        newSet.add(33);
        newSet.add(11);
        newSet.remove(33);
        System.out.println(newSet);

    }
}
