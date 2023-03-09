package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

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

        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V"};
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

        String[] expected = {"Film V"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void MoreThanTheLimit() {

        String film1 = "Film I";
        String film2 = "Film II";
        String film3 = "Film III";
        String film4 = "Film IV";
        String film5 = "Film V";
        String film6 = "Film VI";
        String film7 = "Film VII";
        String film8 = "Film VIII";
        String film9 = "Film IX";
        String film10 = "Film X";
        String film11 = "Film XI";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);


        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V", "Film VI", "Film VII", "Film VIII", "Film IX", "Film X", "Film XI"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    void shouldShowNothing() {
        FilmManager manager = new FilmManager(0);
        String[] actual = manager.findLast();
        FilmManager[] expected = new FilmManager[0];
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void lessThanLimit() {
        String film1 = "Film I";
        String film2 = "Film II";
        String film3 = "Film III";

        FilmManager manager = new FilmManager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] expected = {"Film I", "Film II", "Film III"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void equivalentToLimit() {
        String film1 = "Film I";
        String film2 = "Film II";
        String film3 = "Film III";
        String film4 = "Film IV";
        String film5 = "Film V";
        String film6 = "Film VI";
        String film7 = "Film VII";
        String film8 = "Film VIII";
        String film9 = "Film IX";
        String film10 = "Film X";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);

        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V", "Film VI", "Film VII", "Film VIII", "Film IX", "Film X"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

}
