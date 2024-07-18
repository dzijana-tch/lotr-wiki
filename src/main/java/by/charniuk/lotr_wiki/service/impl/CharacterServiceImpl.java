package by.charniuk.lotr_wiki.service.impl;

import by.charniuk.lotr_wiki.model.Character;
import by.charniuk.lotr_wiki.repository.CharacterRepository;
import by.charniuk.lotr_wiki.service.CharacterService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class CharacterServiceImpl implements CharacterService {

    private final CharacterRepository characterRepository;

    @Override
    public boolean addCharacter(Character character) {
        if (characterRepository.findByName(character.getName()) != null) {
            return false;
        }
        characterRepository.save(character);
        return true;
    }

    @Override
    public List<Character> getAllCharacters() {
        return characterRepository.findAll();
    }

    @Override
    public List<Character> searchByName(String name) {
        return characterRepository.findByNameContainingIgnoreCase(name);
    }

    @Override
    public boolean editCharacter(Character character) {
        if (characterRepository.findByName(character.getName()) == null) {
            return false;
        }
        characterRepository.save(character);
        return true;
    }

    @Override
    @Transactional
    public boolean removeCharacter(String name) {
        if (characterRepository.findByName(name) == null) {
            return false;
        }
        characterRepository.deleteByName(name);
        return true;
    }
}
