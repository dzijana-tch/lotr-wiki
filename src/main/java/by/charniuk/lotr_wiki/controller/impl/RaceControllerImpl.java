package by.charniuk.lotr_wiki.controller.impl;

import by.charniuk.lotr_wiki.controller.RaceController;
import by.charniuk.lotr_wiki.model.Race;
import by.charniuk.lotr_wiki.service.RaceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/races")
public class RaceControllerImpl implements RaceController {

    private final RaceService raceService;

    @PostMapping("add")
    @Override
    public String addRace(@RequestBody Race race) {
        if (raceService.addRace(race)) {
            return "Race is added successfully";
        }
        return "Race already exists";
    }

    @GetMapping
    @Override
    public List<Race> getAllRace() {
        return raceService.getAllRace();
    }

    @GetMapping("search/{name}")
    @Override
    public List<Race> searchByName(@PathVariable String name) {
        return raceService.searchByName(name);
    }

    @PutMapping("update")
    @Override
    public String editRace(@RequestBody Race race) {
        if (raceService.editRace(race)) {
            return "Race is changed successfully";
        }
        return "Race is not found";
    }

    @DeleteMapping("remove/{name}")
    @Override
    public String removeRace(@PathVariable String name) {
        if (raceService.removeRace(name)) {
            return "Race is removed successfully";
        }
        return "Race is not found";
    }
}
