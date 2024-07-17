package by.charniuk.lotr_wiki.controller.impl;

import by.charniuk.lotr_wiki.controller.CharacterController;
import by.charniuk.lotr_wiki.service.CharacterService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CharacterControllerImpl implements CharacterController {

    private final CharacterService characterService;

    @Override
    public String addCharacter(Character character) {
        return characterService.addCharacter(character);
    }

    @Override
    public List<Character> getAllCharacters() {
        return characterService.getAllCharacters();
    }

    @Override
    public List<Character> searchByName(String name) {
        return characterService.searchByName(name);
    }

    @Override
    public Character editCharacter(Character character) {
        return characterService.editCharacter(character);
    }

    @Override
    public String remove(Character character) {
        return characterService.remove(character);
    }
}
