package by.charniuk.lotr_wiki.service;

import by.charniuk.lotr_wiki.model.Race;

import java.util.List;

public interface RaceService {

    String addRace(Race race);
    List<Race> getAllRace();
    List<Race> searchByName(String name);
    Race editRace(Race race);
    String remove(Race race);
}
