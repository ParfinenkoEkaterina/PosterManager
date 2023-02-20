package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void shouldAddFilms() {
        String film1 = "Film I";
        String film2 = "Film II";
        String film3 = "Film III";
        String film4 = "Film IV";
        String film5 = "Film V";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);

        String[] expected = { "Film I", "Film II", "Film III",  "Film IV", "Film V" };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldFindLast() {
        String film1 = "Film I";
        String film2 = "Film II";
        String film3 = "Film III";
        String film4 = "Film IV";
        String film5 = "Film V";

        FilmManager manager = new FilmManager();

        manager.addFilm(film5);

        String[] expected = { "Film V" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }


}
