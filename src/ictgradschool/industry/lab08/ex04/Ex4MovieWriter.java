package ictgradschool.industry.lab08.ex04;

import ictgradschool.industry.lab08.ex03.Movie;
import ictgradschool.industry.lab08.ex03.MovieWriter;

/**
 * Created by anhyd on 20/03/2017.
 */
public class Ex4MovieWriter extends MovieWriter {

    @Override
    protected void saveMovies(String fileName, Movie[] films) {

        // TODO Implement this with a PrintWriter

    }

    public static void main(String[] args) {
        new Ex4MovieWriter().start();
    }

}
