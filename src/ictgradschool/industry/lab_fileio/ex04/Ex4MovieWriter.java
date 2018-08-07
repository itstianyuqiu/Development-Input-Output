package ictgradschool.industry.lab_fileio.ex04;

import ictgradschool.industry.lab_fileio.ex03.Movie;
import ictgradschool.industry.lab_fileio.ex03.MovieWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by anhyd on 20/03/2017.
 */
public class Ex4MovieWriter extends MovieWriter {

    @Override
    protected void saveMovies(String fileName, Movie[] films) {

        // TODO Implement this with a PrintWriter
        try (PrintWriter pw=new PrintWriter(new File(fileName))) {
            for (int i = 0; i < films.length; i++) {
                pw.write(films[i].getName()+","+films[i].getYear()+","+films[i].getLengthInMinutes()
                        +","+films[i].getDirector()+"\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("done!");
    }

    public static void main(String[] args) {
        new Ex4MovieWriter().start();
    }

}
