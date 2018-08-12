package ictgradschool.industry.lab_fileio.ex04;

import ictgradschool.industry.lab_fileio.ex03.Movie;
import ictgradschool.industry.lab_fileio.ex03.MovieReader;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by anhyd on 20/03/2017.
 */
public class Ex4MovieReader extends MovieReader {

    @Override
    protected Movie[] loadMovies(String fileName) {

        // TODO Implement this with a Scanner
        Movie[] movies = new Movie[19];
        try (Scanner scan = new Scanner(new File(fileName))) {
            int i=0;
            while (scan.hasNextLine()) {
                String[] oneMovie=(scan.nextLine()).split(",");
//                System.out.println(oneMovie[3]);
                movies[i]=new Movie(oneMovie[0],Integer.parseInt(oneMovie[1]),Integer.parseInt(oneMovie[2]),oneMovie[3]);
//                System.out.println(movies[i].toString());
                i++;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
        return movies;
    }

    public static void main(String[] args) {
        new Ex4MovieReader().start();
    }
}
