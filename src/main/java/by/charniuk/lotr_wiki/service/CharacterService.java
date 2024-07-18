package by.charniuk.lotr_wiki.service;

import by.charniuk.lotr_wiki.model.Character;

import java.util.List;

public interface CharacterService {

    boolean addCharacter(Character character);
    List<Character> getAllCharacters();
    List<Character> searchByName(String name);
    boolean editCharacter(Character character);
    boolean removeCharacter(String name);
}
