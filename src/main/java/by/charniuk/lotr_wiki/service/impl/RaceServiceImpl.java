package by.charniuk.lotr_wiki.service.impl;

import by.charniuk.lotr_wiki.model.Race;
import by.charniuk.lotr_wiki.service.RaceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaceServiceImpl implements RaceService {
    @Override
    public String addRace(Race race) {
        return "";
    }

    @Override
    public List<Race> getAllRace() {
        return List.of();
    }

    @Override
    public List<Race> searchByName(String name) {
        return List.of();
    }

    @Override
    public Race editRace(Race race) {
        return null;
    }

    @Override
    public String remove(Race race) {
        return "";
    }
}
