package ictgradschool.industry.lab_fileio.ex01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExerciseOne {

    public void start() {
        fileReaderEx01();
        printNumEsWithFileReader();

        printNumEsWithBufferedReader();

    }

    /*
    87  W
    105 i
    108 l
    108 l
    32
     */
    private void fileReaderEx01() {
        int num = 0;
        FileReader fR = null;
        try {
            fR = new FileReader("input1.txt");
            num = fR.read();
            System.out.println(num);
            System.out.println(fR.read());
            System.out.println(fR.read());
            System.out.println(fR.read());
            System.out.println(fR.read());
            fR.close();
        } catch (IOException e) {
            System.out.println("IO problem");
        }
    }

    private void printNumEsWithFileReader() {

        int numE = 0;
        int total = 0;

        // TODO Read input2.txt and print the total number of characters, and the number of e and E characters.
        // TODO Use a FileReader.
        File file = new File("input2.txt");
        total=(int)file.length();
        System.out.println("total: "+total);
        try (FileReader fr = new FileReader(file)) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Number of e/E's: " + numE + " out of " + total);
    }

    private void printNumEsWithBufferedReader() {

        int numE = 0;
        int total = 0;

        // TODO Read input2.txt and print the total number of characters, and the number of e and E characters.
        // TODO Use a BufferedReader.

        System.out.println("Number of e/E's: " + numE + " out of " + total);
    }

    public static void main(String[] args) {
        new ExerciseOne().start();
    }

}
