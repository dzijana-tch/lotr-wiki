package by.charniuk.lotr_wiki.service;

import by.charniuk.lotr_wiki.model.Race;

import java.util.List;

public interface RaceService {

    boolean addRace(Race race);
    List<Race> getAllRace();
    List<Race> searchByName(String name);
    boolean editRace(Race race);
    boolean removeRace(String name);
}
