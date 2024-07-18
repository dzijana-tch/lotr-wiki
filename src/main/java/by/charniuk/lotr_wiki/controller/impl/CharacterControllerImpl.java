package by.charniuk.lotr_wiki.controller.impl;

import by.charniuk.lotr_wiki.controller.CharacterController;
import by.charniuk.lotr_wiki.model.Character;
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
        if (characterService.addCharacter(character)) {
            return "Character is added successfully";
        }
        return "Character already exists";
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
    public String editCharacter(Character character) {
        if (characterService.editCharacter(character)) {
            return "Character is changed successfully";
        }
        return "Character is not found";
    }

    @Override
    public String removeCharacter(String name) {
        if (characterService.removeCharacter(name)) {
            return "Character is removed successfully";
        }
        return "Character is not found";
    }
}
