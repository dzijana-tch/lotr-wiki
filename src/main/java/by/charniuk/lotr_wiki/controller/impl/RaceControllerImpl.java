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
        if (raceService.addRace(race)) {
            return "Race is added successfully";
        }
        return "Race already exists";
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
    public String editRace(Race race) {
        if (raceService.editRace(race)) {
            return "Race is changed successfully";
        }
        return "Race is not found";
    }

    @Override
    public String removeRace(String name) {
        if (raceService.removeRace(name)) {
            return "Race is removed successfully";
        }
        return "Race is not found";        }
}
