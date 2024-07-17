package by.charniuk.lotr_wiki.service;

import java.util.List;

public interface CharacterService {

    String addCharacter(Character character);
    List<Character> getAllCharacters();
    List<Character> searchByName(String name);
    Character editCharacter(Character character);
    String remove(Character character);
}
