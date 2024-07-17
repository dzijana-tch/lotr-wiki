package by.charniuk.lotr_wiki.controller;

import java.util.List;

public interface CharacterController {

    String addCharacter(Character character);
    List<Character> getAllCharacters();
    List<Character> searchByName(String name);
    Character editCharacter(Character character);
    String remove(Character character);
}
