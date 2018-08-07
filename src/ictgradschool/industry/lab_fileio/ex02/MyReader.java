package ictgradschool.industry.lab_fileio.ex02;

import ictgradschool.Keyboard;

import java.io.*;

public class MyReader {

    public void start() {

        // TODO Prompt the user for a file name, then read and print out all the text in that file.
        // TODO Use a BufferedReader.
        System.out.print("Enter a file name: ");
        String fileName= Keyboard.readInput();
        while (!(fileName.equalsIgnoreCase("ex02.txt"))){
            System.out.print("File name don't exist. Enter a file name: ");
            fileName= Keyboard.readInput();
            if(fileName.equalsIgnoreCase("ex02.txt")){
                break;
            }
        }
        try(BufferedReader br=new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new MyReader().start();
    }
}
