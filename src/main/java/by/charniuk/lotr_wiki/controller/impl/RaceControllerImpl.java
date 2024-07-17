package by.charniuk.lotr_wiki.controller.impl;

import by.charniuk.lotr_wiki.controller.RaceController;
import by.charniuk.lotr_wiki.model.Race;
import by.charniuk.lotr_wiki.service.RaceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class RaceControllerImpl implements RaceController {

    private final RaceService raceService;

    @Override
    public String addRace(Race race) {
        return raceService.addRace(race);
    }

    @Override
    public List<Race> getAllRace() {
        return raceService.getAllRace();
    }

    @Override
    public List<Race> searchByName(String name) {
        return raceService.searchByName(name);
    }

    @Override
    public Race editRace(Race race) {
        return raceService.editRace(race);
    }

    @Override
    public String remove(Race race) {
        return raceService.remove(race);
    }
}
