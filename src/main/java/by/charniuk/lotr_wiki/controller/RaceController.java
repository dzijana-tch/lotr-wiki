package by.charniuk.lotr_wiki.controller;

import by.charniuk.lotr_wiki.model.Race;

import java.util.List;

public interface RaceController {

    String addRace(Race race);
    List<Race> getAllRace();
    List<Race> searchByName(String name);
    String editRace(Race race);
    String removeRace(String name);
}
