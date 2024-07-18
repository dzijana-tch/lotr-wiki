package by.charniuk.lotr_wiki.controller.impl;

import by.charniuk.lotr_wiki.controller.CharacterController;
import by.charniuk.lotr_wiki.model.Character;
import by.charniuk.lotr_wiki.service.CharacterService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/characters")
public class CharacterControllerImpl implements CharacterController {

    private final CharacterService characterService;

    @PostMapping("add")
    @Override
    public String addCharacter(@RequestBody Character character) {
        if (characterService.addCharacter(character)) {
            return "Character is added successfully";
        }
        return "Character already exists";
    }

    @GetMapping
    @Override
    public List<Character> getAllCharacters() {
        return characterService.getAllCharacters();
    }

    @GetMapping("search/{name}")
    @Override
    public List<Character> searchByName(@PathVariable String name) {
        return characterService.searchByName(name);
    }

    @PutMapping("update")
    @Override
    public String editCharacter(@RequestBody Character character) {
        if (characterService.editCharacter(character)) {
            return "Character is changed successfully";
        }
        return "Character is not found";
    }

    @DeleteMapping("remove/{name}")
    @Override
    public String removeCharacter(@PathVariable String name) {
        if (characterService.removeCharacter(name)) {
            return "Character is removed successfully";
        }
        return "Character is not found";
    }
}
