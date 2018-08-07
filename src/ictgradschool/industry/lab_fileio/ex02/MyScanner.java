package ictgradschool.industry.lab_fileio.ex02;

import ictgradschool.Keyboard;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MyScanner {

    public void start() {

        // TODO Prompt the user for a file name, then read and print out all the text in that file.
        // TODO Use a Scanner.
        System.out.print("Enter a file name: ");
        String fileName= Keyboard.readInput();
        while (!(fileName.equalsIgnoreCase("ex02.txt"))){
            System.out.print("File name don't exist. Enter a file name: ");
            fileName= Keyboard.readInput();
            if(fileName.equalsIgnoreCase("ex02.txt")){
                break;
            }
        }
        try(Scanner s=new Scanner(new File(fileName))){
            while (s.hasNext()){
                System.out.println(s.nextLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new MyScanner().start();
    }
}
