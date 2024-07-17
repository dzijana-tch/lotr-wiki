package by.charniuk.lotr_wiki.service.impl;

import by.charniuk.lotr_wiki.service.CharacterService;

import java.util.List;

public class CharacterServiceImpl implements CharacterService {
    @Override
    public String addCharacter(Character character) {
        return "";
    }

    @Override
    public List<Character> getAllCharacters() {
        return List.of();
    }

    @Override
    public List<Character> searchByName(String name) {
        return List.of();
    }

    @Override
    public Character editCharacter(Character character) {
        return null;
    }

    @Override
    public String remove(Character character) {
        return "";
    }
}
