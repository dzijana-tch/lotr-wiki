package by.charniuk.lotr_wiki.service.impl;

import by.charniuk.lotr_wiki.model.Race;
import by.charniuk.lotr_wiki.repository.RaceRepository;
import by.charniuk.lotr_wiki.service.RaceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class RaceServiceImpl implements RaceService {

    private final RaceRepository raceRepository;

    @Override
    public boolean addRace(Race race) {
        if (raceRepository.findByName(race.getName()) != null) {
            return false;
        }
        raceRepository.save(race);
        return true;
    }

    @Override
    public List<Race> getAllRace() {
        return raceRepository.findAll();
    }

    @Override
    public List<Race> searchByName(String name) {
        return raceRepository.findByNameContainingIgnoreCase(name);
    }

    @Override
    public boolean editRace(Race race) {
        if (raceRepository.findByName(race.getName()) == null) {
            return false;
        }
        raceRepository.save(race);
        return true;
    }

    @Override
    @Transactional
    public boolean removeRace(String name) {
        if (raceRepository.findByName(name) == null) {
            return false;
        }
        raceRepository.deleteByName(name);
        return true;
    }
}
